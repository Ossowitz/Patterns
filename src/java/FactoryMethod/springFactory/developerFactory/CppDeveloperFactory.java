package FactoryMethod.springFactory.developerFactory;

import FactoryMethod.springFactory.developer.CppDeveloper;
import FactoryMethod.springFactory.management.Developer;
import FactoryMethod.springFactory.management.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
