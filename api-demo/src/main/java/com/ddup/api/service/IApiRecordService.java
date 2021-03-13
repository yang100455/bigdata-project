package com.ddup.api.service;

import com.ddup.api.pojo.entity.ApiRecord;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yangxianwei
 * @since 2020-12-02
 */
public interface IApiRecordService extends IService<ApiRecord> {

    void writeRemoteToSzLibrary();

    void writeRemoteToSZT();

}
