package com.alipay.sofa.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 在当前module 中加载mapper
 * @author miaowen
 * @since 2020/12/3 16:53
 */
@Configuration
@MapperScan({"com.alipay.sofa.dao.mapper" })
public class DaoConfig {

}
