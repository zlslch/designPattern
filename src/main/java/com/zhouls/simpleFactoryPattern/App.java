package com.zhouls.simpleFactoryPattern;

public class App {

    public static void main(String[] arg) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = (IPhone)factory.makePhone("MiPhone");            // make xiaomi phone!
        IPhone iPhone = (IPhone)factory.makePhone("iPhone");    // make iphone!
    }

}
