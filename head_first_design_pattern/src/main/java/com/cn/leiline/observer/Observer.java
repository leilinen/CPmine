package com.cn.leiline.observer;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);
}
