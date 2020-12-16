package com.alipay.sofa.isle.sample.service.impl;

import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.springframework.stereotype.Component;

/**
 * @author miaowen
 * @since 2020/12/3 11:55
 */
@Component("mobileDubboService")
@SofaService(uniqueId = "mobileServiceJvm", interfaceType = MobileDubboService.class)
public class MobileDubboServiceImpl implements MobileDubboService {

    @SofaReference(uniqueId = "mobileJvmDao")
    private MobileDubboService mobileJvmDaoRef;

    @Override
    public MobileVO getMobileVo(String mobile) {
        return mobileJvmDaoRef.getMobileVo(mobile);
    }
}
