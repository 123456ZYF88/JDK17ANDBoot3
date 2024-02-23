package com.example.jdk17andboot3.Test;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class 增强型伪随机数发生器356Test {
    //JDK17之前的随机数API没有统一的接口，要实现自己的随机算法页比较麻烦。
    //
    //JDK7为伪随机数生成器（PRNG）提供新的接口类型和实现，使程序使用各种PRNG算法更加容易，更好的支持流式编程。
    //提供了一个新的接口 RandomGenerator ,为所有PRNG算法提供统一的API，同时提供了一个新的类 RandomGeneratorFactory 来构造各种 RandomGenerator 实例。
    //————————————————
    //
    //                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
    //
    //原文链接：https://blog.csdn.net/aitutou/article/details/124248255

    public static void main(String[] args) {
        RandomGeneratorFactory<RandomGenerator>  Factory = RandomGeneratorFactory
                .of("L128X1024MixRandom");//算法名称
        RandomGenerator randomGenerator = Factory.create(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            System.out.println(randomGenerator.nextInt(10));
        }
        //获得所有随机生成算法名称/**/
        RandomGeneratorFactory.all().forEach(e -> System.out.println(e.group() + "-" + e.name()));
    }
}
