package com.zhouls.factoryMethodPattern;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return (Phone) new MiPhone();
    }
}
