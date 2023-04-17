package FactoryMethod.developerFactory;

import FactoryMethod.management.Developer;
import FactoryMethod.management.DeveloperFactory;
import FactoryMethod.developer.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
