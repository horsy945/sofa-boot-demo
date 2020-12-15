package com.alipay.sofa.consumer.repository;

import com.alipay.sofa.consumer.dao.dataobject.MobileDO;
import com.alipay.sofa.consumer.dao.mapper.ConsumerMobileMapper;
import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * todo
 * 直接在类上加注解方式发布 sofa-service Component 注解和 SofaService 注解都没有被扫描
 * @author miaowen
 * @since 2020/12/14 11:03
 */
@Component("mobileRepository")
@SofaService(uniqueId = "mobileJvmService", interfaceType = MobileDubboService.class)
public class MobileRepositoryImpl implements MobileDubboService {

    @Resource
    private ConsumerMobileMapper consumerMobileMapper;

    @Override
    public MobileVO getMobileVo(String mobile) {
        MobileDO mobileDO = consumerMobileMapper.selectByPhone(mobile);

        if (null == mobileDO) {
            return null;
        }
        MobileVO result = new MobileVO();
        BeanUtils.copyProperties(mobileDO, result);
        return result;
    }
}
