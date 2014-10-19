package lv.nikolay.designpatterns.behavioraldesignpatterns.strategy;

import junit.framework.TestCase;
import org.junit.Test;

public class ExampleCodeTest {
    public ExampleCode exampleCode;

    @Test
    public void testCalculateAdd() throws Exception {
        exampleCode = new ExampleCode();
        TestCase.assertEquals(4, exampleCode.calculate("+", 1, 3));
        exampleCode = new ExampleCode();
        TestCase.assertEquals(1, exampleCode.calculate("-", 4, 3));
        exampleCode = new ExampleCode();
        TestCase.assertEquals(3, exampleCode.calculate("*", 1, 3));
        exampleCode = new ExampleCode();
        TestCase.assertEquals(3, exampleCode.calculate("/", 9, 3));
    }

    @Test(expected = RuntimeException.class)
    public void testCalculateExc() throws Exception {
        {
            TestCase.assertEquals(3, exampleCode.calculate("&", 9, 3));
        }
    }


}

