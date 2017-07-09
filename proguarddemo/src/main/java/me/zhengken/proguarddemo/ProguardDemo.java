package me.zhengken.proguarddemo;

import android.support.annotation.Keep;

/**
 * Created by zhengken on 2017/7/2.
 */

public class ProguardDemo {

    int ken = 10;
    int ken2 = 20;

    ProguardDemo() {
        int zhengken = 10;
    }

    @Keep
    ProguardDemo(int a) {
    }

    public void test() {
    }


    public void dddd() {
    }

}
