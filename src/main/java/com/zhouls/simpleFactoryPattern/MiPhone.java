package com.zhouls.simpleFactoryPattern;

/**  具体产品角色：  ⼯⼚类所创建的对象就是此⻆⾊的实例   **/
public class MiPhone implements Phone {

    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make xiaomi phone!");
    }
}
