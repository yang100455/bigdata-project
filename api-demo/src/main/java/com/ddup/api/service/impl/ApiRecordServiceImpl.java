package com.ddup.api.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ddup.api.dao.mapper.ApiRecordMapper;
import com.ddup.api.dao.mapper.SzLibraryMapper;
import com.ddup.api.pojo.entity.ApiRecord;
import com.ddup.api.pojo.entity.SzLibrary;
import com.ddup.api.service.IApiRecordService;
import com.ddup.api.service.ISzLibraryService;
import lombok.SneakyThrows;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yangxianwei
 * @since 2020-12-02
 */
@Service
public class ApiRecordServiceImpl extends ServiceImpl<ApiRecordMapper, ApiRecord> implements IApiRecordService {

    private static Logger log = LoggerFactory.getLogger(ApiRecordServiceImpl.class);

    private static String LIB = "LIB";

    @Autowired
    SzLibraryMapper szLibraryMapper;
    @Autowired
    ISzLibraryService szLibraryService;
    @Autowired
    ApiRecordMapper apiRecordMapper;

    @SneakyThrows
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public void writeRemoteToSzLibrary() {

        ApiRecord record = apiRecordMapper.selectOne(new QueryWrapper<ApiRecord>()
                .lambda()
                .eq(ApiRecord::getApi, LIB)
                .eq(ApiRecord::getEnable, "1"));

        if (Objects.isNull(record)) {
            log.info("没有可用配置.....");
        }

        Long offset = record.getOffset();
        Integer pageSize = record.getPageSize();
        int page = 1;
        int[] start = new int[]{0};
        if (offset > 0) {
            page = (int) (offset / pageSize + 1);
            start[0] = (int) (offset % pageSize);
        }

        OkHttpClient cli = new OkHttpClient();
        FormBody formBody = new FormBody.Builder()
                .add("page", String.valueOf(page))
                .add("rows", String.valueOf(record.getPageSize()))
                .add("appKey", record.getAppKey())
                .build();

        Request request = new Request.Builder()
                .url(record.getUrl())
                .post(formBody)
                .build();

        Response response = cli.newCall(request).execute();
        String resp = response.body().string();
        JSONObject parse = JSONObject.parseObject(resp);

        log.info("total:{},page:{},rows:{} ", parse.get("total"), parse.get("page"), parse.get("rows"));

        List<SzLibrary> libraries = JSON.parseArray(parse.getString("data"), SzLibrary.class);
        List<SzLibrary> newList = libraries.subList(start[0], libraries.size());
        szLibraryService.saveBatch(newList);
        record.setOffset(record.getOffset() + newList.size());
        apiRecordMapper.updateById(record);

    }


    public static void main(String[] args) {

    }
}
