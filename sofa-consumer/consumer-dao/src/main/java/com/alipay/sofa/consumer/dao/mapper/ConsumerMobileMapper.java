package com.alipay.sofa.consumer.dao.mapper;

import com.alipay.sofa.consumer.dao.dataobject.MobileDO;
import org.apache.ibatis.annotations.Param;

/**
 * @author miaowen
 */
public interface ConsumerMobileMapper {
    /**
     * 按号码前缀查询
     * @param phone 号码前7位
     * @return 号码段归属地信息
     */
    MobileDO selectByPhone(@Param("phone") String phone);
}
