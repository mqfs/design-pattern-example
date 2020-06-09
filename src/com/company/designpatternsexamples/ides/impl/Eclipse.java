package com.company.designpatternsexamples.ides.impl;

import com.company.designpatternsexamples.ides.Ide;

public class Eclipse implements Ide {

    @Override
    public void use() {
        System.out.println("Use the Eclipse IDE.");
    }
}
