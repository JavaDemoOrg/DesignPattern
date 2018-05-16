package com.abt.sample.strategy;

/**
 * @描述： @客户端代码：实现不同的策略
 * @作者： @黄卫旗
 * @创建时间： @17/05/2018
 */
public class DoStrategy {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }

}
