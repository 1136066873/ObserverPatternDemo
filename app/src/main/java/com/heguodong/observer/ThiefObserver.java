package com.heguodong.observer;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/24.
 */

public class ThiefObserver implements Observer {
    @Override
    public void update() {
        Log.e("heguodong","小偷知道了押运珠宝的车出现状况");
    }
}
