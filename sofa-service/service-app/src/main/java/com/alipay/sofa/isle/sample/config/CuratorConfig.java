package com.alipay.sofa.isle.sample.config;

import org.apache.curator.test.TestingServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 启动内存zookeeper
 * @author miaowen
 * @since 2020/12/16 17:39
 */
@Component
@ConditionalOnProperty(name = "dubbo.registry.inmemory.start")
public class CuratorConfig {
    @Value("${dubbo.registry.port:2182}")
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
