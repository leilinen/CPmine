package com.cn.leiline.observer;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
