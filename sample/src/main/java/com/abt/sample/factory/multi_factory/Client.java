package com.abt.sample.factory.multi_factory;

import com.abt.sample.factory.factory_method.impl_1_0.Factory;
import com.abt.sample.factory.factory_method.impl_1_0.Product;

/**
 * @描述： @Client
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product pA = factoryA.createProduct();
        pA.method();

        Factory factoryB = new ConcreteFactoryB();
        Product pB = factoryB.createProduct();
        pB.method();
    }
}
