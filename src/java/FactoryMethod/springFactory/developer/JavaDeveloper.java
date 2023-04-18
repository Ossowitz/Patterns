package FactoryMethod.springFactory.developer;

import FactoryMethod.springFactory.management.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
