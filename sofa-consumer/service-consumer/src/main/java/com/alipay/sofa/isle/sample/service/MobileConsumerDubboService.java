package com.alipay.sofa.isle.sample.service;

import com.alipay.sofa.isle.sample.vo.MobileVO;

/**
 * @author miaowen
 * @since 2020/12/3 15:52
 */
public interface MobileConsumerDubboService {
    MobileVO getMobileVo(String mobile);
}
