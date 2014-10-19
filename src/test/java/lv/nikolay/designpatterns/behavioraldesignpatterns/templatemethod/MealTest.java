package lv.nikolay.designpatterns.behavioraldesignpatterns.templatemethod;

import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/21/13
 * Time: 1:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class MealTest {
    @Before
    public void setUp() throws Exception {

    }
    @Test
    public void testMeals (){
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();
    }
}
