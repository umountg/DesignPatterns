package lv.nikolay.designpatterns.structuraldesignpatterns.decorator;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testAnimals()
    {
        Animal animal = new LivingAnimal();
        animal.describe();

        animal = new LegDecorator(animal);
        animal.describe();

        animal = new WingDecorator(animal);
        animal.describe();

        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
        animal = new GrowlDecorator(animal);
        animal.describe();
    }
}
