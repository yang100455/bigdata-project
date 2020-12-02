package com.ddup.api.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("t_sz_library")
public class SzLibrary implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 年龄
     */
    @TableField("age")
    private String AGE;

    /**
     * 图书分类代码
     */
    @TableField("classno")
    private String CLASSNO;

    /**
     * 出版年限
     */
    @TableField("publishyear")
    private String PUBLISHYEAR;

    /**
     * 出版社
     */
    @TableField("publisher")
    private String PUBLISHER;

    /**
     * 作者
     */
    @TableField("author")
    private String AUTHOR;

    /**
     * 书名
     */
    @TableField("title")
    private String TITLE;

    /**
     * 归还日期
     */
    @TableField("retudate")
    private String RETUDATE;

    /**
     * 归还时间
     */
    @TableField("retutime1")
    private String RETUTIME1;

    /**
     * 借出日期
     */
    @TableField("eventdate")
    private String EVENTDATE;

    /**
     * 借出时间
     */
    @TableField("eventtime1")
    private String EVENTTIME1;

    /**
     * 性别
     */
    @TableField("gender")
    private String GENDER;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


}
