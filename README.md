this is JDK17    AND Springboot3 New Feature



# JDK17
306:	Restore Always-Strict Floating-Point Semantics

356:	Enhanced Pseudo-Random Number Generators

382:	New macOS Rendering Pipeline

391:	macOS/AArch64 Port

398:	Deprecate the Applet API for Removal

403:	Strongly Encapsulate JDK Internals

406:	Pattern Matching for switch (Preview)

407:	Remove RMI Activation

409:	Sealed Classes

410:	Remove the Experimental AOT and JIT Compiler

411:	Deprecate the Security Manager for Removal

412:	Foreign Function & Memory API (Incubator)

414:	Vector API (Second Incubator)

415:	Context-Specific Deserialization Filters


### 306：恢复始终严格的浮点语义
[Strictfp306Test.java](Strictfp306Test.java)

### 356：增强型伪随机数生成器
[增强型伪随机数发生器356Test.java](%D4%F6%C7%BF%D0%CD%CE%B1%CB%E6%BB%FA%CA%FD%B7%A2%C9%FA%C6%F7356Test.java)

### 382:[新的macOS渲染管道](https://openjdk.org/jeps/382)
使用 Apple Metal API 为 macOS 实现 Java 2D 内部渲染管道，作为现有管道的替代方案，现有管道使用已弃用的 Apple OpenGL API。


### 391:[macOS/AArch64端口](https://openjdk.org/jeps/391)
将 JDK 移植到 macOS/AArch64。
### 398:[弃用Applet API以进行删除](https://openjdk.org/jeps/398)
弃用 Applet API 以进行删除。这本质上是无关紧要的，因为所有 Web 浏览器供应商要么取消了对 Java 浏览器插件的支持，要么宣布了这样做的计划。

### 403：[强封装JDK内部](https://openjdk.org/jeps/403)
严格封装 JDK 的所有内部元素，除了 关键的内部 API，例如sun.misc.Unsafe. 将不再可能通过单个命令行选项来放松内部元素的强封装，
这在 JDK 9 到 JDK 16 中是可能的。

简而言之就是java内部的大部分类，除了关键的内部API，如sun.misc.Unsafe类，都进行强封装，
默认情况下不允许开发人员利用反射等手段去访问内部非public的类、成员变量等，使java更加安全。
但是可以通过设置参数–add-export或–add-opens来指定哪些类可以被访问。
### 406:开关的模式匹配（预览）
switch 通过表达式和语句的模式匹配以及模式语言的扩展来增强 Java 编程语言。
扩展模式匹配switch允许针对多个模式测试表达式，每个模式都有一个特定的操作，以便可以简洁、安全地表达复杂的面向数据的查询。
这是JDK 17 中的预览语言功能。

[Switch开关的模式匹配.java](Switch%BF%AA%B9%D8%B5%C4%C4%A3%CA%BD%C6%A5%C5%E4.java)
### 407:删除RMI激活
删除远程方法调用 （RMI） 激活机制，同时保留 RMI 的其余部分。

RMI（远程方法调用）是实现RPC（远程过程调用）的java api。

由于web技术的发展，有关过滤请求、身份认证、安全性等问题都已经在web服务领域得到解决，但这些机制都不在RMI的激活模型中，
即便是不要激活机制也不影响RMI的其他部分，还能减少维护成本，所以在JDK15中把RMI的激活机制标记为弃用，JDK17中正式删除。
### 409：[密封类](https://openjdk.org/jeps/409)
[密封类Test.java](%C3%DC%B7%E2%C0%E0Test.java)

使用密封的类和接口增强 Java 编程语言。 密封的类和接口限制哪些其他类或接口可以扩展，或者 实施它们。

密封类（Sealed Classes）是JDK15引入的，在JDK17正式转正。

密封类可以对继承或者实现他们的类进行限制。

### 410:删除实验AOT和JIT编译器
删除基于 Java 的实验性提前 （AOT） 和实时 （JIT） 编译器。

自推出以来，该编译器几乎没有用处，维护它所需的工作量很大。

保留实验性的 Java 级 JVM 编译器接口 （JVMCI），以便开发人员可以继续使用外部构建的编译器版本进行 JIT 编译。

AOT(Ahead Of Time 运行前编译)即jaotc，可以将java代码编译成二进制，JVM直接用这些二进制，而不是在运行时再花时间用JIT（Just in Time 即时编译）编译。

AOT优点在于占用内存低，启动速度快，缺点是在程序运行前编译会使程序的安装时间增加，牺牲java的一致性；JIT优点在于吞吐量高，可以根据当前情况实时编译生成最优机器指令，
缺点是编译需要占用运行时资源，启动速度较慢。

这是oracle自己做的实验性质的东西，由于使用实在太少，并且第三方有成熟的虚拟机（官方推荐 GraalVM ），所以就删除了。

### 411:[弃用安全管理器以进行删除](https://openjdk.org/jeps/411)
弃用安全管理器，以便在将来的发行版中删除。安全管理器可追溯到 Java 1.0。
多年来，它一直不是保护客户端 Java 代码的主要手段，也很少用于保护服务器端代码。
为了推动 Java 向前发展，我们打算弃用安全管理器，以便与旧版 Applet API （JEP 398） 一起删除。

SecurityManager 安全管理器是一个允许应用程序实现安全策略的类，但是这么多年很少被使用，为了减少维护工作，在JDK17中标记为弃用，将来会和Applet API一起删除。

### 412：[外部功能和记忆API（培养器）](https://openjdk.org/jeps/412)
引入一个 API，通过该 API 可以与 Java 运行时之外的代码和数据进行互操作。

通过有效地调用外部函数（即 JVM 外部的代码）并安全地访问外部内存（即不受 JVM 管理的内存），API 使 Java 程序能够调用本机库并处理本机数据，而不会像 JNI 那样脆弱和危险。

这个新功能与JNI（java本地接口）有关，JNI允许java程序与程序以外的代码或数据做交互，常见的JNI即Thread类里的start()方法。

JNI只能和以C和C++语言编写的库进行交互， 在通用性上有所不足，
且JNI无法监控JVM以外的代码运行情况，外部可以通过getStaticField等函数访问JDk内部，甚至改变在final修饰下的字段值，本质上JNI是不安全的。

因此java开发人员觉得有一个更加安全易用的，基于java模型的JNI替代API，就有了这个孵化器，说不定在后面哪个版本的JDK中就孵化成功了。
### 414：API载体（第二培养箱）
这是一个矢量API，用于矢量计算，日常开发中不会用到。

引入一个 API 来表达向量计算，该计算在 运行时到支持的 CPU 架构上的最佳矢量指令，因此 实现优于等效标量计算的性能。
### 415:上下文特定的反序列化筛选器
允许应用程序配置特定于上下文和动态选择的 通过调用 JVM 范围的过滤器工厂反序列化过滤器，以选择 每个单独的反序列化操作的筛选器。

这个新特性是为了反序列化的安全性考虑的，由于反序列化的数据内容决定了创建的对象、字段值以及他们之间的引用关系。

多数情况下了流中的字节是从未知、不受信任或未经身份验证的客户端接收的，
因此可能会有利用反序列化攻击程序的情况发生，为了避免这类问题JDK9新增了反序列化过滤器，
JDK17在此基础上又新增了基于特定上下文的反序列化过滤器，可以通过JVM范围的过滤器工厂配置特定于上下文和动态选择的反序列化过滤器

# 重点 巨快的jdk17

华硕无畏pro15 6800H + 32g + 固态硬盘

循环 10000000次

JDK8 共耗时：31800毫秒

JDK17 共耗时：17482毫秒


```java
for (int i = 0; i < 10000000; i++) {
System.out.println("第" + i + "次循环");
}
long end = System.currentTimeMillis();
System.out.println("共耗时：" + (end - begin) + "毫秒");`
```




 # SpringBoot3 



@[TOC](文章目录)

---
[官方链接===============================官方](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Release-Notes)
# 一、Spring_Boot_3
## 1、基本变化
Spring Boot3于2020年5月20日发布，9月正式维护
必须JDk17以上版本， idea 必须 是2021版以上
## 2、Spring Framework 6
Spring Boot 3.0 基于 [Spring Framework 6](https://github.com/spring-projects/spring-framework/wiki/What%27s-New-in-Spring-Framework-6.x) 构建并需要 Spring Framework 6

## 3、部分第三方jar将更新到最新稳定版
看官网

## 4、部分依赖从Java EE改为Jakarta EE
Spring Boot 3.0 已将所有依赖项的 API 从 Java EE 迁移到 Jakarta EE API。只要有可能，我们都会选择 Jakarta EE 10 兼容的依赖项

Jakarta EE 名字为开发者投票选择。
# 二、变化
## 2.1、spring.factories文件废弃
如果你有自己写的springboot-starter，那么你一定用/META-INF/spring.favtories文件定义过发现自动配置。
但是在sbt2.7时，这个文件被弃用了，但还没有移除这个功能，在sbt3中，它被移除了。
![在这里插入图片描述](https://img-blog.csdnimg.cn/direct/e8a2c2cdb6394ac98e3e5217ffa852ce.png)

## 2.2、Spring Native （GraalVM ）
[官网怎么使用](https://docs.spring.io/spring-boot/docs/3.0.0/reference/html/native-image.html#native-image)

就是将你的jar直接打包成exe，直接可以运行，不同系统打包不同格式

Spring Native 也是升级的一个重大特性，支持使用 GraalVM 将 SpringBoot 的应用程序编译成本地可执行的镜像文件，可以显著提升启动速度、峰值性能以及减少内存使用。

我们传统的应用都是编译成字节码，然后通过 JVM 解释并最终编译成机器码来运行，而 Spring Native 则是通过 AOT 提前编译为机器码，在运行时直接静态编译成可执行文件，不依赖 JVM。GraalVM的即时编译器和AOT编译器可以显著提高应用程序的性能。据测试，GraalVM的性能可以比传统的JVM高出20%-100%。

## 2.3、jakarta代替javax

## 2.4、改进的@ConstructorBinding检测
以前如果希望属性绑定到类中，我们通过使用@ConfigurationProperties和@ConstructorBinding注解可以做到。

新版本针对该注解做了优化，当使用构造函数绑定@ConfigurationProperties 时，如果类只有一个参数的构造函数，则不再需要@ConstructorBinding注解。

有多个构造函数，就使用@ConstructorBinding来告诉 Spring 使用哪个构造函数。
## 2.5、Log4j2增强
特定于配置文件的配置
比如下面针对不同环境的配置方式。
```xml
   <SpringProfile name="staging">
       <!-- configuration to be enabled when the "staging" profile is active -->
   </SpringProfile>
   
   <SpringProfile name="dev | staging">
       <!-- configuration to be enabled when the "dev" or "staging" profiles are active -->
   </SpringProfile>
   
   <SpringProfile name="!production">
       <!-- configuration to be enabled when the "production" profile is not active -->
   </SpringProfile>

```

环境属性查找
支持在 Log4j2配置中引用 Spring 环境中的属性，使用 Spring: 前缀。
```xml
<Properties>
    <Property name="applicationName">${spring:spring.application.name}</property>
</Properties>

```

Log4j2 系统属性
## 2.6、RestTemplate默认httpclient变动
## 2.7、Spring Boot 3.0  改进的安全特性，例如支持 OAuth 2.0 和 JSON Web Token (JWT) 身份验证。

## Micrometer 升级（一个监控系统数据的东西好像是）


Spring Boot 3.0 支持 Micrometer 1.10 中引入的新的 Observation API，新的 ObservationRegistry提供一个 API 就可以创建 metrics和 trace，新版本 SpringBoot 现在将会自动装配ObservationRegistry，并且可以使用ObservationRegistryCustomizer进一步定制化ObservationRegistry。
## Micrometer Tracing 自动装配
SpringBoot 现在自动装配Micrometer Tracing ，包括对 Brave, OpenTelemetry, Zipkin 和 Wavefron 的支持。

另外，当引入io.micrometer:micrometer-registry-otlp包之后， OtlpMeterRegistry也会自动装配。
## Prometheus 支持
如果存在 Prometheus 依赖和 Tracer Bean，将会自动装配SpanContextSupplier，SpanContextSupplier将会把 metrics 关联到 trace，因为它会把当前的 traceID 和 spanID 保存到 Prometheus 的 Example 中。
## 更灵活的Spring Data JDBC装配
Spring Data JDBC的自动装配现在更加灵活，Spring Data JDBC 所需的几个自动装配的 Bean现在是有条件的，可以通过定义相同类型的Bean来替换，可以替换的Bean类型如下： 看参考文章

## Kafka异步ACK支持
现在可以通过设置spring.kafka.listener.async-acks=true来开启 Kafka 的异步 ACK，并且需要设置spring.kafka.listener.async-mode为manual or manual-immediate。
## 新的Elasticsearch JAVA客户端支持
支持新版本的 ES JAVA 客户端自动装配，可以通过属性spring.elasticsearch.*来配置。
## JdkClientHttpConnector 自动装配
如果没有 Netty Reactor、Jetty reactive client 和 Apache HTTP client ，将自动装配JdkClientHttpConnector，这允许WebClient和 JDK 的HttpClient一起使用。
## @SpringBootTest优化升级
现在任何@SpringBootConfiguration中的main方法都可以使用@SpringBootTest注解，但是需要将@SpringBootTest的useMainMethod属性设置为UseMainMethod.ALWAYS 或者UseMainMethod.WHEN_AVAILABLE。

# 杂七杂八

- 在应用程序启动时候不再记录Host Name，可以提高启动速度，缩短网络查找的耗时
- 移除了对 SecurityManager 的支持。
- 在Spring Framework6中移除CommonsMultipartResolver之后，对它的支持也被移除了。
- 为了保持和 Spring6 版本一致，不再推荐使用spring.mvc.ignore-default-model-on-redirect
- Web Jar 资源处理器 path pattern 可以使用参数spring.mvc.webjars-path-pattern 、 spring.webflux.webjars-path-pattern自定义
- Tomcat 远程 IP 阀的可信代理可以使用 server.Tomcat.Remoteip.trust-proxy 配置。
- 可以通过定义 ValidationConfigurationCustomizer 来自定义 Bean 的校验。
- Log4j2的 Log4jBridgeHandler 现在用于将基于 JUL 的日志路由到 Log4j2，而不是通过 SLF4J 路由。
- 实现 MeterBinder 接口的 Bean 现在只有在所有单例 Bean 初始化之后才绑定到meter registries。
- 用于 Brave 和 OpenTelemetry 的 SpanCustomizer bean 现在会自动装配
- Micrometer 的 JvmCompilationMetrics 现在会自动装配。
- DiskSpaceHealthIndicator 现在其日志消息中包含路径及其健康详细信息。
- 现在可以从包装的 DataSource 派生 DataSourceBuilder。
- 现在可以使用 spring.data.mongodb.additional-hosts 属性为 MongoDB 配置多个 host。
- 可以使用 spring.elasticsearch.socket-keep-alive 属性配置 Elasticsearch 的 socketKeepAlive 属性。
- 在使用 spring-rabbit-stream 时，RabbitStreamTemplate 和 Environment 现在将自动装配，无论 spring.rabbitmq.listener.type 是否是 stream。
- 已有的 Kafka 主题可以使用 spring.kafka.admin.modify-topic-configs 进行修改。
- WebDriverScope 和 WebDriverTestExectionListener 现在是 public，以方便在自定义测试配置中使用 WebDriver。




# 抛弃或者替换等

- @ConstructorBinding已从org.springframework.boot.context.properties包移至org.springframework.boot.context.properties.bind.
- JsonMixinModule基于扫描的构造函数已被弃用。
- ClientHttpRequestFactorySupplier应替换为ClientHttpRequestFactories.
- 不再支持 Cookie 注释属性。
- RestTemplateExchangeTagsProvider、WebClientExchangeTagsProvider、WebFluxTagsProvider和WebMvcTagsProvider相关类已替换为ObservationConvention等效类。
- 基类上的无参数构造函数HealthContributor @Configuration已被弃用。
- DefaultTestExecutionListenersPostProcessor并SpringBootDependencyInjectionTestExecutionListener已被弃用，取而代之的是 Spring 框架的ApplicationContextFailureProcessor.
- 这些属性management.metrics.export.<product>已弃用，替代品是management.<product>.metrics.export.
- @AutoConfigureMetrics已被弃用，取而代之的是@AutoConfigureObservability.
- management.prometheus.metrics.export.pushgateway.shutdown-operation支持 POST

# 参考文章
个人笔记，不同意见，望有交流
直接可以点击跳转连接

[作者 Spring](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Release-Notes)

[作者：艾小仙](https://www.cnblogs.com/ilovejaney/p/16931780.html#micrometer-%E5%8D%87%E7%BA%A7)

