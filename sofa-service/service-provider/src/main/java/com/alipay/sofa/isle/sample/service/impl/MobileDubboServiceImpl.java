package com.alipay.sofa.isle.sample.service.impl;

import com.alipay.sofa.dao.dataobject.MobileDO;
import com.alipay.sofa.dao.mapper.MobileMapper;
import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author miaowen
 * @since 2020/12/3 11:55
 */
@Component("mobileDubboService")
@SofaService(uniqueId = "mobileServiceJvm", interfaceType = MobileDubboService.class)
public class MobileDubboServiceImpl implements MobileDubboService {

    @Resource
    private MobileMapper mobileMapper;

    @Override
    public MobileVO getMobileVo(String mobile) {
        MobileDO mobileDO = mobileMapper.selectByPhone(mobile);

        if (null == mobileDO){
            return null;
        }
        MobileVO result = new MobileVO();
        BeanUtils.copyProperties(mobileDO, result);
        return result;
    }
}
