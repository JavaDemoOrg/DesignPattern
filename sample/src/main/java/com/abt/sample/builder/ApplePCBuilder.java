package com.abt.sample.builder;

/**
 * @描述： @ApplePCBuilder
 * @作者： @黄卫旗
 * @创建时间： @2018/5/17
 */
public class ApplePCBuilder extends Builder {
    private Computer mApplePc = new AppleComputer();

    @Override
    public void buildCPU(int core) {
        mApplePc.setCPU(core);
    }

    @Override
    public void buildRAM(int gb) {
        mApplePc.setRAM(gb);
    }

    @Override
    public void buildOs(String os) {
        mApplePc.setOs(os);
    }

    @Override
    public Computer create() {
        return mApplePc;
    }

}
