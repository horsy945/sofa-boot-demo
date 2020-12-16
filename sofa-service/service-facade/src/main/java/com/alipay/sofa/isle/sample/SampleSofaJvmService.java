package com.alipay.sofa.isle.sample;

import com.alipay.sofa.isle.sample.vo.MobileVO;

/**
 * sofa jvm 服务实例
 * @author miaowen
 * @since 2020/12/3 11:49
 */
public interface SampleSofaJvmService {

    MobileVO getMobileVo(String mobile);
}
