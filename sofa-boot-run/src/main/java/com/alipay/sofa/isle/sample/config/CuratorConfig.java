package com.alipay.sofa.isle.sample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import org.apache.curator.test.TestingServer;

/**
 * @author miaowen
 * @since 2020/12/15 14:47
 */
@Component
public class CuratorConfig {

    @Value("${dubbo.registry.port}")
    private Integer port;

    private static TestingServer server = null;

    @PostConstruct
    public void startServer() throws Exception {
        if (null == server) {
            server = new TestingServer(port);
            server.start();
        }
    }
}
