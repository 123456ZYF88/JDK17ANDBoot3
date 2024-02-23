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






 