package FactoryMethod.developer;

import FactoryMethod.management.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes code...");
    }
}
