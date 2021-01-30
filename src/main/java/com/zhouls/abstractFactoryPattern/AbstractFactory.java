package com.zhouls.abstractFactoryPattern;

/**  抽象工厂角色: 这是⼯⼚⽅法模式的核⼼ , 它与应⽤程序⽆关。
    是具体⼯⼚⻆⾊必须实现的接⼝或者必须继承的⽗类。在java中它由抽象类或者接⼝来实现  **/
public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
