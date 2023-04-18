package FactoryMethod.springFactory.developer;

import FactoryMethod.springFactory.management.Developer;

public class GoDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Go developer writes Go code...");
    }
}
