package lv.nikolay.designpatterns.creationaldesignpatterns.prototype;

import junit.framework.TestCase;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void checkClones() {

        Person person1 = new Person("Fred");
        Person person2 = (Person) person1.doClone();
        TestCase.assertEquals(person1, person2);
        TestCase.assertSame(person1, person2);
    }
}
