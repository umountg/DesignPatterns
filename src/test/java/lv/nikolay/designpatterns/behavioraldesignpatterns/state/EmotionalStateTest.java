package lv.nikolay.designpatterns.behavioraldesignpatterns.state;

import org.junit.Before;
import org.junit.Test;

public class EmotionalStateTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testState() {
        Person person = new Person(new HappyState());
        System.out.println("Hello in happy state: " + person.sayHello());
        System.out.println("Goodbye in happy state: " + person.sayGoodbye());

        person.setEmotionalState(new SadState());
        System.out.println("Hello in sad state: " + person.sayHello());
        System.out.println("Goodbye in sad state: " + person.sayGoodbye());
    }
}
