package com.company.designpatternsexamples.abstractfactorypattern;

import com.company.designpatternsexamples.ides.Ide;
import com.company.designpatternsexamples.languages.Language;
import com.company.designpatternsexamples.languages.impl.Cpp;
import com.company.designpatternsexamples.languages.impl.Java;
import com.company.designpatternsexamples.languages.impl.Python;

public class LanguageFactory extends AbstractFactory {

    @Override
    public Ide getIde(String ide) {
        return null;
    }

    @Override
    public Language getLanguage(String language) {
        if(language.equals("Cpp")) {
            return new Cpp();
        }else if(language.equals("Java")) {
            return new Java();
        }else if(language.equals("Python")) {
            return new Python();
        }
        return null;
    }
}
