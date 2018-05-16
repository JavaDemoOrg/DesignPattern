package com.abt.sample.strategy_case;

/**
 * @描述： @DoThisCase
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class DoThisCase {

    public static void main(String[] args) {
        //正常收费
        CashContext cc = new CashContext("正常收费");
        double totalPrices = cc.getResult(500);//原价
        System.out.println(totalPrices);

        //满300返100
        cc = new CashContext("满300返100");
        totalPrices = cc.getResult(500);//原价
        System.out.println(totalPrices);
    }

}
