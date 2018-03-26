package com.heguodong.observer;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 何国栋 on 2018/3/24.
 */

public class LongMenBiaoJuobserved implements observed {

    private List<Observer> list = new ArrayList<Observer>();

    @Override
    public void addWatcher(Observer observer) {
        Log.e("heguodong","我是龙门镖局车队，我将要添加并告诉你们我要出门了");
        list.add(observer);
    }

    @Override
    public void removeWatcher(Observer observer) {
        Log.e("heguodong","我是龙门镖局车队，我将要移除 " + observer.getClass().getName());
        list.remove(observer);
    }

    @Override
    public void notifyWatchers() {
        Log.e("heguodong","我是龙门镖局车队，我可能要出事儿，help! "  );
        for (Observer observer : list){
            observer.update();
        }
    }
}
