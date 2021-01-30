package com.zhouls.abstractFactoryPattern;

/**  具体产品角色：  ⼯⼚类所创建的对象就是此⻆⾊的实例   **/
public class MAC implements PC{

    public MAC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make MAC!");
    }
}
