package com.company.designpatternsexamples.abstractfactorypattern;

import com.company.designpatternsexamples.ides.Ide;
import com.company.designpatternsexamples.ides.impl.Eclipse;
import com.company.designpatternsexamples.ides.impl.Intellij;
import com.company.designpatternsexamples.languages.Language;

public class IdeFactory extends AbstractFactory {

    @Override
    public Ide getIde(String ide) {
        if(ide.equals("Eclipse")) {
            return new Eclipse();
        }else if(ide.equals("Intellij")) {
            return new Intellij();
        }
        return null;
    }

    @Override
    public Language getLanguage(String language) {
        return null;
    }
}
