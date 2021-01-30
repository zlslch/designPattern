package com.zhouls.factoryMethodPattern;

public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return (Phone) new IPhone();
    }
}
