package com.abt.sample.factory.factory_method.impl_1_0;

/**
 * @描述： @Client
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product p = factory.createProduct();
        p.method();
    }
}
