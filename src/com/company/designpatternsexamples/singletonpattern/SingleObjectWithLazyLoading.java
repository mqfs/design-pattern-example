package com.company.designpatternsexamples.singletonpattern;

public class SingleObjectWithLazyLoading {

    private static SingleObjectWithLazyLoading instance;

    private SingleObjectWithLazyLoading() {}

    public static synchronized SingleObjectWithLazyLoading getInstance() {
        if(instance == null) {
            instance = new SingleObjectWithLazyLoading();
        }
        return instance;
    }
}
