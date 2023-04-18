package FactoryMethod.springFactory;

import FactoryMethod.springFactory.management.Developer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactorySpringMethod {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("javaDeveloper", Developer.class).writeCode();
    }
}
