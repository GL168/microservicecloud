# microservicecloud
微服务小项目

|名称                                         |  描述 |
|------------------------------------------- | ---------------------------------------------------|
|microservicecloud                           | 微服务小项目主包名 |
|microservicecloud-api                       | 封装的整体Entity/接口/公共配置等 |
|microservicecloud-provider-dept-8001        | 微服务落地的服务提供者 （数据库db1）|
|microservicecloud-provider-dept-8002        | 微服务落地的服务提供者 （数据库db2）|
|microservicecloud-provider-dept-8002        | 微服务落地的服务提供者 （数据库db3）|
|microservicecloud-consumer-dept-80          | 微服务调用的客户端使用（ribbon+restTemplate） |
|microservicecloud-consumer-dept-feign          | 微服务调用的客户端使用 （feign注解+接口编程）|     
|microservicecloud-eureka-7001          | eureka-7001 集群服务 | 
|microservicecloud-eureka-7002          | eureka-7002 集群服务 | 
|microservicecloud-eureka-7003          | eureka-7003 集群服务  | 
|microservicecloud-provider-dept-hystrix-8001 | 服务熔断hystrix|
|microservicecloud-consumer-hystrix-dashboard | 服务监控hystrixDashboard |
|microservicecloud-zuul-gateway-9527 | 路由网关业务 |


### Eureka本地服务集群host配置
* 127.0.0.1  eureka7001.com 
* 127.0.0.1  eureka7002.com 
* 127.0.0.1  eureka7003.com

### Zuul服务网关本地host配置  
* 127.0.0.1  myzuul.com