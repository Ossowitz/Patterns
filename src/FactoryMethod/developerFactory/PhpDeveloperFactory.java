package FactoryMethod.developerFactory;

import FactoryMethod.management.Developer;
import FactoryMethod.management.DeveloperFactory;
import FactoryMethod.developer.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
