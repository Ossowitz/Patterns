package FactoryMethod.vanillaJava.developerFactory;

import FactoryMethod.vanillaJava.management.DeveloperFactory;
import FactoryMethod.vanillaJava.developer.CppDeveloper;
import FactoryMethod.vanillaJava.management.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
