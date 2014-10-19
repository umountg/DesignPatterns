package lv.nikolay.designpatterns.creationaldesignpatterns.singleton;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class SingletonExampleTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void duplicationTest () {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample singletonExample1 = SingletonExample.getInstance();
        TestCase.assertSame(singletonExample, singletonExample1);

    }
}
