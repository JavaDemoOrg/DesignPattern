package com.abt.sample.factory.simple_factory;

/**
 * @描述： @OperationAdd
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = super.getNumberA() + super.getNumberB();
        return result;
    }
}
