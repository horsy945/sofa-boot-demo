package com.alipay.sofa.isle.sample.service;

import com.alipay.sofa.consumer.dao.dataobject.MobileDO;
import com.alipay.sofa.consumer.dao.mapper.ConsumerMobileMapper;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * 条件装配暴露dubbo服务
 * @author miaowen
 * @since 2020/12/3 15:53
 */
public class MobileConsumerDubboServiceImpl implements MobileConsumerDubboService {
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
