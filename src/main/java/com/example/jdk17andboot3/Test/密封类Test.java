package com.example.jdk17andboot3.Test;

public class 密封类Test {
    //Person类被 sealed 修饰，只允许（permits）Male和Female类继承，继承的类必须有 final 或者 no-sealed 来修饰。
    //
    //Function接口被 sealed 修饰，只允许（permits）Male和Female类实现，实现的类必须有 final 或者 no-sealed 来修饰。

    public static void main(String[] args) {
        Male male = new Male();
        male.eat();

        Female female = new Female();
        female.eat();
    }

    static sealed class Person permits Male, Female {
    }

    static final class Male extends Person implements Function {
        @Override
        public void eat() {
            System.out.println("eat 1");
        }
    }

    static non-sealed class Female extends Person implements Function {
        @Override
        public void eat() {
            System.out.println("eat 2");
        }
    }

    sealed interface Function permits Male, Female {
        void eat();
    }
    //————————————————
    //
    //                            版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
    //
    //原文链接：https://blog.csdn.net/aitutou/article/details/124248255

}
