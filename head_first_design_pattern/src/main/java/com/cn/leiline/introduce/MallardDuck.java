package com.cn.leiline.introduce;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
