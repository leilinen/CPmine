package com.cn.leiline.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public class StatisticDisplay implements Observer, DisplayElement{
    private final List<Float> temperature = new ArrayList<>();

    private Subject weatherData;
    public StatisticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        float avg = 0;
        float max = 0;
        float min = 0;
        calculateTemperature(avg, max, min);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature.add(temp);
        display();
    }

    private void calculateTemperature(float avg, float max, float min) {
        avg = this.temperature.get(0);
        max = this.temperature.get(0);
        min = this.temperature.get(0);
        for (int i=1; i< this.temperature.size(); i++) {
            float t = this.temperature.get(i);
            avg += t;
            if (t > max) {
                max = t;
            }
            if (t < min) {
                min = t;
            }
        }
        avg = avg / this.temperature.size();
        System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min);
    }
}
