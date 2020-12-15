package com.alipay.sofa.dao.mapper;

import com.alipay.sofa.dao.dataobject.MobileDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author miaowen
 */
@Repository
public interface MobileMapper {
    /**
     * 按号码前缀查询
     * @param phone 号码前7位
     * @return 号码段归属地信息
     */
    MobileDO selectByPhone(@Param("phone") String phone);

}
