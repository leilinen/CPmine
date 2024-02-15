package com.cn.leiline.introduce;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
