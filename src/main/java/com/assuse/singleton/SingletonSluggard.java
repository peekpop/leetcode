package com.assuse.singleton;

/**
 * @author cobra
 * @link www.assuse.com
 * @date 2021/4/7
 * @description 单例模式-懒汉式
 */
public class SingletonSluggard {
    private SingletonSluggard(){}
    private static SingletonSluggard instance = null;
    public static SingletonSluggard getInstance(){
        if(instance == null){
            synchronized (SingletonSluggard.class){
                instance = new SingletonSluggard();
            }
        }
        return instance;
    }
}
