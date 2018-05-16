package com.abt.sample.strategy_case;

/**
 * @描述： @返利收费子类
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moenyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moenyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition)
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        return result;
    }

}