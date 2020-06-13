package com.company.designpatternsexamples.singletonpattern;

public class SingleObjectWithNonLazyLoading {

    private static SingleObjectWithNonLazyLoading instance = new SingleObjectWithNonLazyLoading();

    private SingleObjectWithNonLazyLoading() {}

    public static SingleObjectWithNonLazyLoading getInstance() {
        return instance;
    }
}
