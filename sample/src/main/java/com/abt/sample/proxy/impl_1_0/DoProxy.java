package com.abt.sample.proxy.impl_1_0;

/**
 * @描述： @DoProxy
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class DoProxy {
    public static void main(String[] args) {
        AbstractObject obj = new ProxyObject();
        obj.operation();
    }
}