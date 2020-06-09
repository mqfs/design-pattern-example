package com.company.designpatternsexamples.abstractfactorypattern;

public class FactoryProducer {

    public AbstractFactory getFactory(String type) {
        if(type.equals("Ide")) {
            return new IdeFactory();
        }else if(type.equals("Language")) {
            return new LanguageFactory();
        }
        return null;
    }
}
