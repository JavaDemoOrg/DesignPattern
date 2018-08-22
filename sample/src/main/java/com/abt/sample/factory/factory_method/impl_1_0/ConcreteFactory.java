package com.abt.sample.factory.factory_method.impl_1_0;

/**
 * @描述： @ConcreteFactory
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public class ConcreteFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
