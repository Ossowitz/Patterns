package FactoryMethod.vanillaJava.developerFactory;

import FactoryMethod.vanillaJava.management.Developer;
import FactoryMethod.vanillaJava.management.DeveloperFactory;
import FactoryMethod.vanillaJava.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
