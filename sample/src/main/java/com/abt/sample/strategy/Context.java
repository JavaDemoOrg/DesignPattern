package com.abt.sample.strategy;

/**
 * @描述： @上下文，维护一个对策略类对象的引用
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.AlgorithmInterface();
    }

}
