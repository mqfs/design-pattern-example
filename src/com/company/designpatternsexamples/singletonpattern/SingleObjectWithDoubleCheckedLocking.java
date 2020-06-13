package com.company.designpatternsexamples.singletonpattern;

public class SingleObjectWithDoubleCheckedLocking {

    private volatile static SingleObjectWithDoubleCheckedLocking instance;

    private SingleObjectWithDoubleCheckedLocking() {}

    public static SingleObjectWithDoubleCheckedLocking getInstance() {
        if(instance == null) {
            synchronized (SingleObjectWithDoubleCheckedLocking.class) {
                if(instance == null) {
                    instance = new SingleObjectWithDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
