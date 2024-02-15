package com.cn.leiline.introduce;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2024/2/15
 */
public class MuteQuack implements QuackBehavior {


    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
