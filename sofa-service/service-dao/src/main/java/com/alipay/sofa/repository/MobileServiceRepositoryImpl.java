package com.alipay.sofa.repository;

import com.alipay.sofa.dao.dataobject.MobileDO;
import com.alipay.sofa.dao.mapper.MobileMapper;
import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

/**
 * todo
 * 直接在类上加注解方式发布 sofa-service Component 注解和 SofaService 注解都没有被扫描
 * @author miaowen
 * @since 2020/12/14 11:03
 */
//@Component("mobileRepository")
//@SofaService(uniqueId = "mobileJvmService", interfaceType = MobileDubboService.class)
public class MobileServiceRepositoryImpl implements MobileDubboService {

    @Resource
    private MobileMapper mobileMapper;

    @Override
    public MobileVO getMobileVo(String mobile) {
        MobileDO mobileDO = mobileMapper.selectByPhone(mobile);

        if (null == mobileDO) {
            return null;
        }
        MobileVO result = new MobileVO();
        BeanUtils.copyProperties(mobileDO, result);
        return result;
    }
}
