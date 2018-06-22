package com.abt.sample.builder;

/**
 * @描述： @Computer产品抽象类, 为了例子简单, 只列出这几个属性
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public abstract class Computer {

    protected int mCpuCore = 1;
    protected int mRamSize = 0;
    protected String mOs = "Dos";

    protected Computer() { }

    // 设置CPU核心数
    public abstract void setCPU(int core);

    // 设置内存
    public abstract void setRAM(int gb);

    // 设置操作系统
    public abstract void setOs(String os);

    @Override
    public String toString() {
        return "[mCpuCore=" + mCpuCore + ", mRamSize=" + mRamSize
                + ", mOs=" + mOs + "]";
    }

}
