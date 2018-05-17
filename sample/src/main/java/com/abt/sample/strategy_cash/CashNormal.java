package com.abt.sample.strategy_cash;

/**
 * @描述： @正常收费子类
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
