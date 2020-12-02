package com.ddup.api.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangxianwei
 * @since 2020-12-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_api_record")
public class ApiRecord implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    /**
     * api
     */
    @TableField("api")
    private String api;


    /**
     * appkey
     */
    @TableField("appKey")
    private String appKey;

    /**
     * 请求api路径
     */
    private String url;

    /**
     * 每页大小（不建议修改此值）
     */
    private Integer pageSize;

    /**
     * 偏移量
     */
    private Long offset;

    /**
     * 是否可用
     */
    private Integer enable;

    /**
     * api描述
     */
    private String apiDesc;

    /**
     * 表映射
     */
    private String tableMapping;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


}
