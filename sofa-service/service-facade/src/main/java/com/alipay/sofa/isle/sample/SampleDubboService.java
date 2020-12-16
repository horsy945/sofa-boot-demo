package com.alipay.sofa.isle.sample;

import com.alipay.sofa.isle.sample.vo.MobileVO;

/**
 * dubbo 服务sample
 * @author miaowen
 * @since 2020/12/16 15:25
 */
public interface SampleDubboService {

    MobileVO getMobileVo(String mobile);

}
