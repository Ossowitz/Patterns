package FactoryMethod.developer;

import FactoryMethod.management.Developer;

public class JsDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JS developer writes JS code...");
    }
}
