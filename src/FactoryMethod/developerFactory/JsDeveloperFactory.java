package FactoryMethod.developerFactory;

import FactoryMethod.management.Developer;
import FactoryMethod.management.DeveloperFactory;
import FactoryMethod.developer.JsDeveloper;

public class JsDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JsDeveloper();
    }
}
