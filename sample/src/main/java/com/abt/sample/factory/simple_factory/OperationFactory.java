package com.abt.sample.factory.simple_factory;

/**
 * @描述： @OperationFactory
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
