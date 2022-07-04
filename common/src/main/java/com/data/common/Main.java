package com.data.common;

/**
 * @author: caozhou
 * @create: 2022-07-04 09:56
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\nMain.main开始");

        HelloService helloService = new HelloService();
        helloService.sayHello("sayHello");
        System.out.println("Main.main结束");
    }
}
