package com.example.jdk17andboot3.Test;

public class Switch开关的模式匹配 {
    public static void main(String[] args) {
        Integer a = 10;
        JDK17_before_instanceof_switch(a);
    }
    // //从JDK17以前，switch不支持instanceof，如果有多个instanceof只能用if-else来表达：
    public static void JDK17_before_instanceof_switch(Object o) {
        //o instanceof Integer i 为JDK16新特性
        if (o instanceof Integer i ){
            System.out.println("Integer");
        }else if (o instanceof  Long i){
            System.out.println("Long");
        }
    }
    //JDK17之后，switch开始支持instanceof，简化写法：
    /*JDK21需要*/
    public static void JDK17_Instanceof_switch(Object o) {
    /*    switch (o){
            case  Integer i -> System.out.println("Integer");
            case Double d -> System.out.println("double");
            default -> System.out.println("无");
        }
*/
    }



    public static void JDK11_switch() {
        String day = "MONDAY";
        switch (day) {
            case "MONDAY":
                System.out.println(1);
                break;
            case "TUESDAY":
                System.out.println(2);
                break;
            default:
                System.out.println(0);
                break;
        }
    }

    public static void JDK12_switch() {
        String day = "MONDAY";
        switch (day) {
            case "MONDAY" -> System.out.println(1);
            case "TUESDAY" -> System.out.println(2);
            default -> System.out.println(0);
        }
    }
    public static void JDK13_switch() {
        String day = "MONDAY";
      int i =    switch (day) {
            case "MONDAY" -> 1;
            case "TUESDAY" ->2;
            default -> 3;
        };
        System.out.println(i);
    }



}
