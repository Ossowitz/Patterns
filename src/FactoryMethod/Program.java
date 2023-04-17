package FactoryMethod;

import FactoryMethod.developerFactory.*;
import FactoryMethod.management.Developer;
import FactoryMethod.management.DeveloperFactory;
import FactoryMethod.management.Specialty;

public class Program {

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
