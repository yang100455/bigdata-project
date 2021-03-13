package com.ddup.api.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-03-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sz_metro")
public class SzMetro implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 卡号
     */
    @TableField("card_no")
    private String card_no;

    @TableField("deal_date")
    private String deal_date;

    /**
     * 交易类型
     */
    @TableField("deal_type")
    private String deal_type;

    /**
     * 交易金额
     */
    @TableField("deal_money")
    private String deal_money;

    /**
     * 交易值
     */
    @TableField("deal_value")
    private String deal_value;

    /**
     * 设备编码
     */
    @TableField("equ_no")
    private String equ_no;

    /**
     * 公司名称
     */
    @TableField("company_name")
    private String company_name;

    /**
     * 站点
     */
    @TableField("station")
    private String station;

    /**
     * 车牌
     */
    @TableField("car_no")
    private String car_no;

    /**
     * 联程标记
     */
    @TableField("conn_mark")
    private String conn_mark;

    /**
     * 结算日期
     */
    @TableField("close_date")
    private String close_date;


}
