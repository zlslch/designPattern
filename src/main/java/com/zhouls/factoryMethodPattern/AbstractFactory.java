package com.zhouls.factoryMethodPattern;

/**  抽象工厂类角色： 工厂方法模式的核⼼，定义了产品的生产接口，但不负责具体的产品，将生产任务交给不同的派生类具体工厂**/
public interface AbstractFactory {
    Phone makePhone();
}
