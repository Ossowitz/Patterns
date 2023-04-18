package FactoryMethod.vanillaJava.developerFactory;

import FactoryMethod.vanillaJava.management.Developer;
import FactoryMethod.vanillaJava.management.DeveloperFactory;
import FactoryMethod.vanillaJava.developer.JsDeveloper;

public class JsDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JsDeveloper();
    }
}
