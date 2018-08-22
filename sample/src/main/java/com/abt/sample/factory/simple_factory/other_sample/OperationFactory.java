package com.abt.sample.factory.simple_factory.other_sample;

/**
 * @描述： @何为简单工厂模式，只有一个工厂，不需要提供工厂接口，
 * 也不需要实现多个不同的工厂类，就叫简单工厂模式
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }
        return oper;
    }
}
