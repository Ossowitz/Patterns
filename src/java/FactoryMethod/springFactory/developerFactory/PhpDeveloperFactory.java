package FactoryMethod.springFactory.developerFactory;

import FactoryMethod.springFactory.developer.PhpDeveloper;
import FactoryMethod.springFactory.management.Developer;
import FactoryMethod.springFactory.management.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
