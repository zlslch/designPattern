package com.zhouls.simpleFactoryPattern;

/** ⼯⼚类⻆⾊： 简单工厂模式的核⼼，含有⼀定的商业逻辑和判断逻辑，⽤来创建产品 【简单工厂模式中工厂负责生产所有产品 】**/
public class PhoneFactory {

    public Phone makePhone(String phoneType) {
        if(phoneType.equalsIgnoreCase("MiPhone")){
            return new MiPhone();  //用到向上转型，如 Animal animal = new Cat(); 猫是动物的一种
        }
        else if(phoneType.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        }
        return null;
    }

}
