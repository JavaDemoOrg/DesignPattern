package com.abt.sample.proxy.impl_1_1;

/**
 * @描述： @Client
 * @作者： @黄卫旗
 * @创建时间： @24/08/2018
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = new ProxySubject(subject);
        proxy.visit();
    }
}
