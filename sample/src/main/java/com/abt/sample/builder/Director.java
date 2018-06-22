package com.abt.sample.builder;

/**
 * @描述： @Director
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 构建对象
     * @param cpu
     * @param ram
     * @param os
     */
    public void construct(int cpu, int ram, String os) {
        mBuilder.buildCPU(cpu);
        mBuilder.buildRAM(ram);
        mBuilder.buildOs(os);
    }
}
