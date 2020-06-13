package com.company.designpatternsexamples.singletonpattern;

public class SingleObjectWithStaticInnerClass {

    private static class SingleHolder {
        private static final SingleObjectWithStaticInnerClass instance = new SingleObjectWithStaticInnerClass();
    }

    public static SingleObjectWithStaticInnerClass getInstance() {
        return SingleHolder.instance;
    }
}
