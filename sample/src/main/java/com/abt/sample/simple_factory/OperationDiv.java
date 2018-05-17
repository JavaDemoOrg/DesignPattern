package com.abt.sample.simple_factory;

/**
 * @描述： @OperationDiv
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        if (super.getNumberB() == 0)
            throw new ArithmeticException("除数不能为0.");
        result = super.getNumberA() / super.getNumberB();
        return result;
    }

}

