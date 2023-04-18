package FactoryMethod.springFactory.developerFactory;

import FactoryMethod.springFactory.developer.GoDeveloper;
import FactoryMethod.springFactory.management.Developer;
import FactoryMethod.springFactory.management.DeveloperFactory;

public class GoDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new GoDeveloper();
    }
}
