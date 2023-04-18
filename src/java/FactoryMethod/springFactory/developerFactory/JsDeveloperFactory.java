package FactoryMethod.springFactory.developerFactory;

import FactoryMethod.springFactory.developer.JsDeveloper;
import FactoryMethod.springFactory.management.Developer;
import FactoryMethod.springFactory.management.DeveloperFactory;

public class JsDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JsDeveloper();
    }
}
