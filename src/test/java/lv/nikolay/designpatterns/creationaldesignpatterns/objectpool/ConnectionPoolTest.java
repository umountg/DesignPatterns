package lv.nikolay.designpatterns.creationaldesignpatterns.objectpool;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/17/13
 * Time: 8:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionPoolTest {

    public ConnectionPool cp = new ConnectionPool(2);

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testGet() throws Exception {
        Poolable clientCon;
        clientCon =  cp.get();
        TestCase.assertNotNull(clientCon);

    }

    @Test(expected = RuntimeException.class)
    public void testEx() throws Exception {
        Poolable clientCon;
        clientCon =  cp.get();
        clientCon =  cp.get();
        clientCon =  cp.get();

    }

}
