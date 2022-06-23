# 基于Springboot2.0的Dubbo入门项目（dubbo-spring-boot-starter）

Dubbo是阿里巴巴公司开源的一个高性能优秀的服务框架，使得应用可通过高性能的 RPC 实现服务的输出和输入功能，可以和Spring框架无缝集成。最近半年来，Dubbo的得到了快速的维护，官方也推出了集成Springboot的jar包，及其贴合时代潮流，那么现在就来讲Springboot2.0如何集成官方Dubbo。

## **一、运行工具与环境**

运行环境：JDK 8，Maven 3.3+
技术栈：SpringBoot 2.0+、Dubbo 2.6+、ZooKeeper 3.3+
工具：IntelliJ IDEA、谷歌浏览器

## **二、Springboot快速集成Dubbo关键的依赖**
```maven
<dependency>
    <groupId>com.alibaba.boot</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
    <version>0.2.0</version>
</dependency>
```




