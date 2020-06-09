package com.company.designpatternsexamples.abstractfactorypattern;

import com.company.designpatternsexamples.ides.Ide;
import com.company.designpatternsexamples.languages.Language;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory ideFactory = factoryProducer.getFactory("Ide");
        Ide eclipse = ideFactory.getIde("Eclipse");
        Ide intellij = ideFactory.getIde("Intellij");
        eclipse.use();
        intellij.use();
        AbstractFactory languageFactory = factoryProducer.getFactory("Language");
        Language cpp = languageFactory.getLanguage("Cpp");
        Language java = languageFactory.getLanguage("Java");
        Language python = languageFactory.getLanguage("Python");
        cpp.code();
        java.code();
        python.code();
    }
}
