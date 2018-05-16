package com.abt.sample.strategy_case;

/**
 * @描述： @打折收费子类
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}