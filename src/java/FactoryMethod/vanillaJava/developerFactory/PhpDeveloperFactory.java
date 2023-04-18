package FactoryMethod.vanillaJava.developerFactory;

import FactoryMethod.vanillaJava.management.Developer;
import FactoryMethod.vanillaJava.management.DeveloperFactory;
import FactoryMethod.vanillaJava.developer.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
