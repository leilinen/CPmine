package com.cn.leiline.introduce;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
