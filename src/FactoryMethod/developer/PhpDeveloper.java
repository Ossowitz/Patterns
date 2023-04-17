package FactoryMethod.developer;

import FactoryMethod.management.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code...");
    }
}
