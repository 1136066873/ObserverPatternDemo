package com.heguodong.observer;

/**
 * Created by 何国栋 on 2018/3/24.
 */

public interface observed {

    void addWatcher(Observer observer);

    void removeWatcher(Observer observer);

    void notifyWatchers();
}
