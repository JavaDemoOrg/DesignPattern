package com.abt.sample.factory.factory_method.impl_2_0;

import com.abt.sample.factory.factory_method.impl_1_0.Product;

/**
 * @描述： @ConcreteFactory
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public class ConcreteFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)p;
    }
}
