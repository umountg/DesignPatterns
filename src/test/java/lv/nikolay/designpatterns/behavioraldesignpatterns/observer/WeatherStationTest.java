package lv.nikolay.designpatterns.behavioraldesignpatterns.observer;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/21/13
 * Time: 4:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherStationTest {
    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void testNotifications()
    {
        WeatherStation weatherStation = new WeatherStation(33);

        WeatherCustomer1 wc1 = new WeatherCustomer1();
        WeatherCustomer2 wc2 = new WeatherCustomer2();
        weatherStation.addObserver(wc1);
        weatherStation.addObserver(wc2);

        weatherStation.setTemperature(34);

        weatherStation.removeObserver(wc1);

        weatherStation.setTemperature(35);
    }
}
