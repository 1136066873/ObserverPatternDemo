package com.heguodong.observer;

import android.util.Log;

/**
 * Created by 何国栋 on 2018/3/24.
 */

public class SecurityObserver  implements Observer{
    @Override
    public void update() {
        Log.e("heguodong","保安知道了押运珠宝的车出现了问题");
    }
}
