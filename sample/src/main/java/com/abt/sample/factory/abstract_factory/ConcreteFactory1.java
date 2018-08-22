package com.abt.sample.factory.abstract_factory;

/**
 * @描述： @ConcreteFactory1
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
