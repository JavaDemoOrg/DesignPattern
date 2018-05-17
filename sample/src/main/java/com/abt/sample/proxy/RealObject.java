package com.abt.sample.proxy;

/**
 * @描述： @RealObject
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        //一些操作
        System.out.println("一些操作");
    }
}
