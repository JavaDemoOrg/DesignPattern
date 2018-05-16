package com.abt.sample.strategy_case;

/**
 * @描述： @策略与简单工厂结合:将实例化具体策略的过程由客户端转移到这里Context类
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(String type){
        switch(type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn(300, 100);
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
