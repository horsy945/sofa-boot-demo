package com.alipay.sofa.consumer.dao.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 号码归属地缓存表
 * @author miaowen
 */
@Data
@NoArgsConstructor
public class MobileDO {
    /**
     * INTEGER(8) 必填
     * 主键
     */
    private Integer id;

    /**
     * CHAR(9) 默认值[] 必填
     * 手机号码段
     */
    private String phone;

    /**
     * CHAR(10) 默认值[] 必填
     * 姓名
     */
    private String name;

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填
     * 修改时间
     */
    private Date gmtModified;

}
