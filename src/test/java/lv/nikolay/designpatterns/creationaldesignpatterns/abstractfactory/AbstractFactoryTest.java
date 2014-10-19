package lv.nikolay.designpatterns.creationaldesignpatterns.abstractfactory;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/21/13
 * Time: 10:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractFactoryTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void checkAbstractFactory() {

        AbstractFactory abstractFactory = new AbstractFactory();

        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory("reptile");

        Animal a1 = speciesFactory1.getAnimal("tyrannosaurus");
        TestCase.assertEquals("Roar", a1.makeSound());

        Animal a2 = speciesFactory1.getAnimal("snake");
        TestCase.assertEquals("Hiss", a2.makeSound());

        SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory("mammal");

        Animal a3 = speciesFactory2.getAnimal("dog");
        TestCase.assertEquals("Woof", a3.makeSound());

        Animal a4 = speciesFactory2.getAnimal("cat");
        TestCase.assertEquals("Meow", a4.makeSound());

    }
}
