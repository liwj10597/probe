package com.data.common;

import java.lang.instrument.Instrumentation;

/**
 * @author: caozhou
 * @create: 2022-07-04 09:58
 * @description:
 */
public class PrintAgent {

    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("\nPrintAgent.premain开始");
        System.out.println("   PrintAgent.premain入参：" + agentArgs);

        instrumentation.addTransformer(new PrintTransformer());

        System.out.println("PrintAgent.premain结束");
    }

    public static void main(String[] args) {
        //main方法在idea打包时需要，实际上没什么作用，不会被执行。
    }

}
