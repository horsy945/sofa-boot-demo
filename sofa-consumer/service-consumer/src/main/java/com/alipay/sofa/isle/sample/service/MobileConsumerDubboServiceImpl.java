package com.alipay.sofa.isle.sample.service;

import com.alipay.sofa.isle.sample.vo.MobileVO;
import org.springframework.stereotype.Component;

/**
 * @author miaowen
 * @since 2020/12/3 15:53
 */
//@Service(timeout = 3000)
//@Component
public class MobileConsumerDubboServiceImpl implements MobileConsumerDubboService {
//    @Resource
//    private MobileMapper mobileMapper;

    @Override
    public MobileVO getMobileVo(String mobile) {
//        MobileDO mobileDO = mobileMapper.selectByPhone(mobile);
//
//        if (null == mobileDO) {
//            return null;
//        }
//        MobileVO result = new MobileVO();
//        BeanUtils.copyProperties(mobileDO, result);
//        return result;
        return null;
    }
}
