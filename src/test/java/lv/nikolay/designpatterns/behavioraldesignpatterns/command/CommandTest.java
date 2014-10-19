package lv.nikolay.designpatterns.behavioraldesignpatterns.command;

import org.junit.Before;
import org.junit.Test;

public class CommandTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCommands() {

        Lunch lunch = new Lunch(); // receiver
        Command lunchCommand = new LunchCommand(lunch); // concrete command

        Dinner dinner = new Dinner(); // receiver
        Command dinnerCommand = new DinnerCommand(dinner); // concrete command

        MealInvoker mealInvoker = new MealInvoker(lunchCommand); // invoker
        mealInvoker.invoke();

        mealInvoker.setCommand(dinnerCommand);
        mealInvoker.invoke();
    }
}
