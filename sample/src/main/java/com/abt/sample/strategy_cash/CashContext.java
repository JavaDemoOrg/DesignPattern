package com.abt.sample.strategy_cash;

/**
 * @描述： @策略与简单工厂结合:将实例化具体策略的过程由客户端转移到这里Context类
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cash){
        cs = cash;
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
