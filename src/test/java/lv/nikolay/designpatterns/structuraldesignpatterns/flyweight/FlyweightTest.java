package lv.nikolay.designpatterns.structuraldesignpatterns.flyweight;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/21/13
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightTest {
    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void testCreation (){
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        for (int i = 0; i < 5; i++) {
            Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
            flyweightAdder.doMath(i, i);

            Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
            flyweightMultiplier.doMath(i, i);
        }
    }
}
