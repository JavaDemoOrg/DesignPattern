package com.abt.sample.factory.simple_factory;

import com.abt.sample.factory.factory_method.impl_1_0.ConcreteProductB;
import com.abt.sample.factory.factory_method.impl_1_0.Product;

/**
 * @描述： @@何为简单工厂模式，只有一个工厂，不需要提供工厂接口，
 * 也不需要实现多个不同的工厂类，就叫简单工厂模式
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public class Factory {
    public static Product createProduct() {
        return new ConcreteProductB();
    }
}
