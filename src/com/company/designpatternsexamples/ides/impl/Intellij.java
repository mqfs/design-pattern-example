package com.company.designpatternsexamples.ides.impl;

import com.company.designpatternsexamples.ides.Ide;

public class Intellij implements Ide {

    @Override
    public void use() {
        System.out.println("Use the Intellij IDE.");
    }
}
