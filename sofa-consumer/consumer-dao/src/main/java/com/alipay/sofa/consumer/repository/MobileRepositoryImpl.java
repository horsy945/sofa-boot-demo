package com.alipay.sofa.consumer.repository;

import com.alipay.sofa.consumer.dao.dataobject.MobileDO;
import com.alipay.sofa.consumer.dao.mapper.ConsumerMobileMapper;
import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * 暴露一个服务，通过 @Configuration 方式
 * @author miaowen
 * @since 2020/12/14 11:03
 */
@NoArgsConstructor
@AllArgsConstructor
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
