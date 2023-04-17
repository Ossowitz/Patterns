package FactoryMethod.developerFactory;

import FactoryMethod.management.DeveloperFactory;
import FactoryMethod.developer.CppDeveloper;
import FactoryMethod.management.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
