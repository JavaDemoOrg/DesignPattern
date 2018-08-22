package com.abt.sample.factory.factory_method.impl_2_0;

import com.abt.sample.factory.factory_method.impl_1_0.Product;

/**
 * @描述： @Factory
 * @作者： @黄卫旗
 * @创建时间： @23/08/2018
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
