package com.cn.leiline.introduce;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
