package lv.nikolay.designpatterns.structuraldesignpatterns.proxy;

import org.junit.Before;
import org.junit.Test;


public class ProxyTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testFastThing() {
        Proxy proxy = new Proxy();

        FastThing fastThing = new FastThing();
        fastThing.sayHello();

        proxy.sayHello();
    }
}
