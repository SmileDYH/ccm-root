### 基于Spring Cloud Nacos搭建微服务项目

1、Nacos
父级模块 ccm-parent
订单模块 ccm-order
用户模块 ccm-user
主要是实现了注册中心、配置中心，
通过Feign接口调用（实现了服务接口调用【基于Http的Rest API方式】 和 负载均衡【Ribbon】）

参考：https://juejin.cn/post/6884261157763285005

2、Sentinel
ccm-user实现了Sentinel

3、Gateway
ccm-gateway新增网关模块
参考：https://juejin.cn/post/6921977877236252680#heading-7

