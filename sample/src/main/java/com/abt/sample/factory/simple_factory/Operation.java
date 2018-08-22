package com.abt.sample.factory.simple_factory;

/**
 * @描述： @Operation
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public abstract class Operation {
    private double numberA = 0;
    private double numberB = 0;

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public double getResult() {
        double result = 0;
        return result;
    }
}
