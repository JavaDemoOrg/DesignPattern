package com.abt.sample.proxy;

/**
 * @描述： @ProxyObject
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class ProxyObject extends AbstractObject{
    RealObject realObject = new RealObject();
    @Override
    public void operation() {
        //调用目标对象之前可以做相关操作
        System.out.println("before");
        realObject.operation();
        //调用目标对象之后可以做相关操作
        System.out.println("after");
    }
}
