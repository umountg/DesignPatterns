package lv.nikolay.designpatterns.behavioraldesignpatterns.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/21/13
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlanetHandlerTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testChain() {
        PlanetHandler chain = setUpChain();

        chain.handleRequest(PlanetEnum.VENUS);
        chain.handleRequest(PlanetEnum.MERCURY);
        chain.handleRequest(PlanetEnum.EARTH);
        chain.handleRequest(PlanetEnum.JUPITER);
    }

    public static PlanetHandler setUpChain() {
        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;
    }
}
