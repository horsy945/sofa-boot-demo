package com.alipay.sofa.isle.sample;

import com.alipay.sofa.isle.sample.vo.MobileVO;

/**
 * @author miaowen
 * @since 2020/12/3 11:49
 */
public interface MobileDubboService {

    MobileVO getMobileVo(String mobile);
}
