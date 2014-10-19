package lv.nikolay.designpatterns.behavioraldesignpatterns.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/17/13
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateStrategyFactory {
    public static Map<String, OperationStrategy> getStrategies() {
        HashMap<String, OperationStrategy> strategies = new HashMap<String, OperationStrategy>();
        strategies.put("+", new AddStrategy());
        strategies.put("-", new MinusStrategy());
        strategies.put("*", new MultStrategy());
        strategies.put("/", new DivStrategy());
        return strategies;
    }
}
