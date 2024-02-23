package com.example.jdk17andboot3.Test;

public class 速度 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        //循环一千万次
        for (int i = 0; i < 10000000; i++) {
            System.out.println("第" + i + "次循环");
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - begin) + "毫秒");
    }//共耗时：17482毫秒

}
