package com.example.jdk17andboot3.Test;

public class Strictfp306Test2 {
    public   strictfp double calculate() {
        // ......
        return 0.1;
    }//由于当下支持SSE2指令集的x86处理器不再需要x87浮点指令集，因此JDK17再次严格要求所有浮点计算，恢复了1.2之前的语义。
}
