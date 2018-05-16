package com.abt.sample.strategy_case;

/**
 * @描述： @现金收费抽象类
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public abstract class CashSuper {
    //参数为原价，返回为当前价
    public abstract double acceptCash(double money);
}