package com.abt.sample.proxy.impl_1_1;

/**
 * @描述： @ProxySubject
 * @作者： @黄卫旗
 * @创建时间： @24/08/2018
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
