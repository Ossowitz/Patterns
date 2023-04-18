package FactoryMethod.springFactory.developer;

import FactoryMethod.springFactory.management.Developer;

public class JsDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Js developer writes Js code...");
    }
}
