package com.assuse.singleton;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/4/7
 * @description 单例模式创建-饿汉式
 */
public class SingletonHungry {
    // 构造器私有化
    private SingletonHungry(){}
    // 类的内部创建静态实例
    private static SingletonHungry instance = new SingletonHungry();
    // 创建getInstance() 静态方法
    public static SingletonHungry getInstance(){
        return instance;
    }

}
