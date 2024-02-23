package com.example.jdk17andboot3.Test;

public strictfp class Strictfp306Test {//恢复始终严格的浮点语义
    //IEEE（电气和电子工程协会）为浮点计算和以各种格式存储浮点值制定了一种标准，包括单精度（32位，用于java）float、双精度（64位，用于java）double，另外一些硬件还提供扩展精度格式，
    //以提供更高的精度和更大的指数范围。在这样的架构下，使用扩展格式计算中间结果可能更有效，还能避免可能发生的舍入错误、上溢和下溢，但是会导致程序在此类架构上产生不同的输出，且x87浮点架构在x86机器上使用扩展精度代价很昂贵。
    //
    //在JVM1.2之前浮点计算是严格要求的，也就是说浮点值的计算结果都必须表现的和标准一样，这使得在常见的x87浮点指令集平台上在需要的地方发生溢出的代价变得昂贵。
    //JVM1.2开始，默认情况下允许中间计算超出IEEE32位和64位格式相关标准指数范围，这样一来在x87平台上，溢出和下溢可能不会在预期的地方发生，而是产生重复性更低更具有意义的结果。
    //
    //在没有上溢和下溢的情况下，如果需要得到重复的结果，java提供了一个当前已过时且未使用的关键字 strictfp ，strictfp修饰符确保浮点计算在所有平台发生上溢和下溢的地方相同，且中间值表示为IEEE单精度和双精度值。
    //
    //该关键字可用于类、接口、非抽象方法。在方法上添加时内部所有计算都使用严格的浮点数学计算；在类上添加时类中所有计算都使用严格的浮点数学计算
    //————————————————
    //
    //                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
    //
    //原文链接：https://blog.csdn.net/aitutou/article/details/124248255


}


