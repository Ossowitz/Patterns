package FactoryMethod.springFactory.developer;

import FactoryMethod.springFactory.management.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes cpp code...");
    }
}
