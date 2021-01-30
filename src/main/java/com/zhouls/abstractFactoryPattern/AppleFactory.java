package com.zhouls.abstractFactoryPattern;

/**  具体工厂角色：　它含有和具体业务逻辑有关的代码。由应⽤程序调⽤以创建对应的具体产品的对象　　**/
public class AppleFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return (Phone) new IPhone();
    }
    @Override
    public PC makePC() {
        return new MAC();
    }
}
