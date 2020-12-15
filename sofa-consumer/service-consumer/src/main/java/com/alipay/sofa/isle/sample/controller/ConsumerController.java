/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.isle.sample.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.sofa.isle.sample.JvmServiceConsumer;
import com.alipay.sofa.isle.sample.MobileDubboService;
import com.alipay.sofa.isle.sample.vo.MobileVO;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import lombok.Setter;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author xuanbei
 * @since 2.4.5
 */
@RestController
public class ConsumerController {

    @Resource
    private JvmServiceConsumer jvmServiceConsumer;

//    @Resource(name = "mobileJvmService")
    @SofaReference(uniqueId = "mobileServiceJvm")
    private MobileDubboService mobileJvmService;

    @SofaReference(uniqueId = "mobileJvmService")
    private MobileDubboService DaoJvmService;

    @Setter
    @Reference
    private MobileDubboService mobileDubboService;

    @RequestMapping("/consumer/say")
    public String consumerSay() throws IOException {
        return jvmServiceConsumer.init();
    }

    @RequestMapping("/consumer/mobile")
    public String queryMobile(@RequestParam("mobile") String mobile) {
        MobileVO mobileVO = mobileJvmService.getMobileVo(mobile);
        if (null != mobileVO) {
            return JSON.toJSONString(mobileVO);
        } else {
            return "mobile not found";
        }
    }

    @RequestMapping("/dubbo/mobile")
    public String queryDubboMobile(@RequestParam("mobile") String mobile){
        MobileVO mobileVO = mobileDubboService.getMobileVo(mobile);

        if (null != mobileVO){
            return JSON.toJSONString(mobileVO);
        }
        else {
            return "mobile not found";
        }
    }

    @RequestMapping("/dao/mobile")
    public String queryDaoMobile(@RequestParam("mobile") String mobile){
        MobileVO mobileVO = DaoJvmService.getMobileVo(mobile);

        if (null != mobileVO){
            return JSON.toJSONString(mobileVO);
        }
        else {
            return "mobile not found";
        }
    }
}
