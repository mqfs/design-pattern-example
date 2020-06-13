package com.company.designpatternsexamples.singletonpattern;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObjectWithNonLazyLoading instance1 = SingleObjectWithNonLazyLoading.getInstance();
        SingleObjectWithLazyLoading instance2 = SingleObjectWithLazyLoading.getInstance();
    }
}
