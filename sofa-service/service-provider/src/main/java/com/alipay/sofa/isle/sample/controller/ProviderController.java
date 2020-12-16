package com.alipay.sofa.isle.sample.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.sofa.isle.sample.SampleSofaJvmService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
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

    @Resource(name = "sampleSofaJvmService")
    private SampleSofaJvmService sampleJvmService;

    @RequestMapping("/provider/test")
    public String providerRest(){
        return "this is provider Controller";
    }

    @RequestMapping("/provider/mobile")
    public String queryMobile(@RequestParam("mobile") String mobile){

        MobileVO mobileVO = sampleJvmService.getMobileVo(mobile);

        if (null != mobileVO){
            return JSON.toJSONString(mobileVO);
        }
        else {
            return "mobile not found";
        }
    }
}
