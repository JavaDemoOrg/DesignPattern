package com.abt.sample.builder;

/**
 * @描述： @Apple电脑
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class AppleComputer extends Computer {

    protected AppleComputer() { }

    @Override
    public void setCPU(int core) {
        mCpuCore = core;
    }

    @Override
    public void setRAM(int gb) {
        mRamSize = gb;
    }

    @Override
    public void setOs(String os) {
        mOs = os;
    }

}
