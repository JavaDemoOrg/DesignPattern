package com.abt.sample.factory.multi_factory;

import com.abt.sample.factory.factory_method.impl_1_0.ConcreteProductA;
import com.abt.sample.factory.factory_method.impl_1_0.Factory;
import com.abt.sample.factory.factory_method.impl_1_0.Product;

/**
 * @描述： @ConcreteFactoryA
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public class ConcreteFactoryA extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
