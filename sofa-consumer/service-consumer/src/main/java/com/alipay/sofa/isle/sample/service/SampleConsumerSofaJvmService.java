package com.alipay.sofa.isle.sample.service;

import com.alipay.sofa.consumer.dao.dataobject.MobileDO;
import com.alipay.sofa.consumer.dao.mapper.ConsumerMobileMapper;
import com.alipay.sofa.isle.sample.SampleSofaJvmService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * 通过SofaConfig 暴露jvm 服务
 * @author miaowen
 * @since 2020/12/16 17:04
 */
public class SampleConsumerSofaJvmService implements SampleSofaJvmService {

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
