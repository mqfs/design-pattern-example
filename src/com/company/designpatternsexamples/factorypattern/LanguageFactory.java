package com.company.designpatternsexamples.factorypattern;

import com.company.designpatternsexamples.languages.Language;
import com.company.designpatternsexamples.languages.impl.Cpp;
import com.company.designpatternsexamples.languages.impl.Java;
import com.company.designpatternsexamples.languages.impl.Python;

public class LanguageFactory {

    public Language getLanguage(String languageType) {
        if(languageType.equals("Cpp")) {
            return new Cpp();
        }else if(languageType.equals("Java")) {
            return new Java();
        }else if(languageType.equals("Python")) {
            return new Python();
        }
        return null;
    }
}
