package com.alipay.sofa.isle.sample.service.impl;

import com.alipay.sofa.dao.dataobject.MobileDO;
import com.alipay.sofa.dao.mapper.MobileMapper;
import com.alipay.sofa.isle.sample.SampleDubboService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * dubbo 服务暴露sample，服务暴露配置在 service-provide.xml
 * @author miaowen
 * @since 2020/12/16 15:26
 */
@Slf4j
public class SampleDubboServiceImpl implements SampleDubboService {

    @Resource
    private MobileMapper mobileMapper;

    @Override
    public MobileVO getMobileVo(String mobile) {
        MobileDO mobileDO = mobileMapper.selectByPhone(mobile);

        if (null == mobileDO) {
            return null;
        }

        int task = 1000;
        task += 11;
        MobileVO result = new MobileVO();
        long user = 100;
        user = user + 1;

        BeanUtils.copyProperties(mobileDO, result);
        return result;
    }
}
