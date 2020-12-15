package com.alipay.sofa.isle.sample.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.sofa.dao.dataobject.MobileDO;
import com.alipay.sofa.dao.mapper.MobileMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author miaowen
 * @since 2020/12/1 15:44
 */
@RestController
public class ProviderController {

    @Resource
    private MobileMapper mobileMapper;

    @RequestMapping("/provider/test")
    public String providerRest(){
        return "this is provider Controller";
    }

    @RequestMapping("/provider/mobile")
    public String queryMobile(@RequestParam("mobile") String mobile){
        MobileDO mobileDO = mobileMapper.selectByPhone(mobile);
        if (null != mobileDO){
            return JSON.toJSONString(mobileDO);
        }
        else {
            return "mobile not found";
        }
    }
}
