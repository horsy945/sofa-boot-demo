# sofa-boot-demo

仓库有3个工程  
sofa-service  提供服务，发布 sofa-jvm-service 及dubbo 服务，有4个子module，service-app 是独立运行时的Application 入口，service-facade 定义api 接口，service-dao 提供底层数据库查询能能力，被service-provider 依赖。
sofa-service 还提供了Controller，可以直接提供http 服务，可以通过8080 端口调用。
sofa-consumer 消费服务，消费由 service-provider 提供的sofaJvmService  及 dubbo service，同时该工程由3个模块组成，consumer-dao 提供数据库查询能力，提供给 service-consumer 调用。service-consumer 也提供了Controller，可以提供http 服务，通过 8080 端口可以访问。

所有服务的dao 层mapper 映射框架是 mybatis-plus-boot-starter，连接池用的 druid，rpc 框架适用的dubbo

数据库使用了h2 内存数据库，数据库启动前会执行一个schema 初始化数据库DML
zookeeper 也使用了内存数据库，配置了一个bean 在启动时先启动zookeeper 服务 curator-test

---------------

运行说明：

1. 先在sofa-service 下执行 mvn clean install -Dmaven.test.skip -Dmaven.javadoc.skip -U
2. 在sofa-consumer 下执行 mvn clean install -Dmaven.test.skip -Dmaven.javadoc.skip -U
3. run sofa-boot-run 工程的ApplicationRun 的main 方法。

----------------
测试url

sofa-service 提供的controller

1.  http://127.0.0.1:8080/provider/test
    无其他依赖，简单输出一个字符串

2.  http://127.0.0.1:8080/provider/mobile?mobile=17706520000
    调用数据库查询一个表的数据后，返回json
    
sofa-consumer 提供的controller
    
1.  http://127.0.0.1:8080/consumer/say
    调用 service-provider 提供的jvm 服务，返回数据
2.  http://127.0.0.1:8080/dubbo/mobile?mobile=17706520000
    调用 service-provider 提供的dubbo 服务，返回数据
    
3.  http://127.0.0.1:8080/consumer/jvm/mobile?mobile=17706520000
    调用 service-provider 提供的jvm 服务，返回数据
4.  http://127.0.0.1:8080/dao/mobile?mobile=17706520000
    调用 consumer-dao 提供的dao 服务。



