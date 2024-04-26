package com.generative.loner;

public class SingletonClass {

    private volatile static SingletonClass instance = null;
    private static final SingletonClass INSTANCE = new SingletonClass();

    private SingletonClass() {
    }


    // lazy instantiation
    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized(SingletonClass.class){
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    // early instantiation
    public static SingletonClass getInstanceWithImmediateInitialization() {
        return INSTANCE;
    }
}
