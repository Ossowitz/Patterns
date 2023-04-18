package FactoryMethod.vanillaJava;

import FactoryMethod.vanillaJava.developerFactory.*;
import FactoryMethod.vanillaJava.management.Developer;
import FactoryMethod.vanillaJava.management.DeveloperFactory;
import FactoryMethod.vanillaJava.management.Specialty;

public class FactoryJavaMethod {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty(Specialty.JS);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(Specialty specialty) {
        return switch (specialty) {
            case JAVA -> new JavaDeveloperFactory();
            case CPP -> new CppDeveloperFactory();
            case PHP -> new PhpDeveloperFactory();
            case JS -> new JsDeveloperFactory();
        };
    }
}
