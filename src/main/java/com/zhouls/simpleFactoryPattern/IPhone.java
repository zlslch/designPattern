package com.zhouls.simpleFactoryPattern;

public class IPhone implements Phone{

    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}
