package com.zhouls.abstractFactoryPattern;

/**  具体产品角色：  ⼯⼚类所创建的对象就是此⻆⾊的实例   **/
public class MiPC implements PC{
    public MiPC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make xiaomi PC!");
    }
}
