package com.company.designpatternsexamples.abstractfactorypattern;

import com.company.designpatternsexamples.ides.Ide;
import com.company.designpatternsexamples.languages.Language;

public abstract class AbstractFactory {

    public abstract Ide getIde(String ide);
    public abstract Language getLanguage(String language);
}
