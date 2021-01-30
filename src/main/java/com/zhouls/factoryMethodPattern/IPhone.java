package com.zhouls.factoryMethodPattern;

import com.zhouls.simpleFactoryPattern.Phone;

public class IPhone implements Phone {

    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}
