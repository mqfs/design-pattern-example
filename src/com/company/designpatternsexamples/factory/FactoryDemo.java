package com.company.designpatternsexamples.factory;

import com.company.designpatternsexamples.languages.Language;

public class FactoryDemo {

    public static void main(String[] args) {
        LanguageFactory languageFactory = new LanguageFactory();
        Language language = languageFactory.getLanguage("Cpp");
        language.code();
        Language language1 = languageFactory.getLanguage("Java");
        language1.code();
        Language language2 = languageFactory.getLanguage("Python");
        language2.code();
    }
}
