package com.miaowen.demo.sofaconsumer.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.curator.test.TestingServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 启动内存zookeeper
 * @author miaowen
 * @since 2020/12/16 17:39
 */
@Configuration
@Slf4j
@ConditionalOnProperty(name = "dubbo.registry.inmemory.start")
public class CuratorConfig {
    @Value("${dubbo.registry.port:2182}")
    private Integer port;

    private static TestingServer server = null;

    @Bean
    public TestingServer startServer() throws Exception {
        if (null == server) {
            server = new TestingServer(port);
            server.start();
            log.info("zookeeper server started ... ");
        }

        return server;
    }
}
