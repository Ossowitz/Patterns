package FactoryMethod.springFactory.developerFactory;

import FactoryMethod.springFactory.developer.JavaDeveloper;
import FactoryMethod.springFactory.management.Developer;
import FactoryMethod.springFactory.management.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
