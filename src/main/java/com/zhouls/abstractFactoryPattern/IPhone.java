package com.zhouls.abstractFactoryPattern;

import com.zhouls.simpleFactoryPattern.Phone;

/**  具体产品角色：  ⼯⼚类所创建的对象就是此⻆⾊的实例   **/
public class IPhone implements Phone {

    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}
