package com.abt.sample.strategy_cash;

/**
 * @描述： @DoThisCase
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class DoThisCase {

    public static void main(String[] args) {
        //正常收费
        CashContext cc = new CashContext(new CashNormal());
        double totalPrices = cc.getResult(500);//原价
        System.out.println(totalPrices);

        //满300返100
        cc = new CashContext(new CashReturn(300, 100));
        totalPrices = cc.getResult(500);//原价
        System.out.println(totalPrices);

        cc = new CashContext(new CashRebate(0.85));
        totalPrices = cc.getResult(500);
        System.out.println(totalPrices);
    }

}
