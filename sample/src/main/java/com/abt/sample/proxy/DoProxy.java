package com.abt.sample.proxy;

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