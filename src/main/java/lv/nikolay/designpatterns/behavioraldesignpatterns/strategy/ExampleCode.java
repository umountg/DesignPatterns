package lv.nikolay.designpatterns.behavioraldesignpatterns.strategy;

import java.util.Map;


public class ExampleCode {
    private Map<String, OperationStrategy> strategies;

    public ExampleCode() {
        strategies = CreateStrategyFactory.getStrategies();
//        strategies.put("+", new AddStrategy());
//        strategies.put("-", new MinusStrategy());
//        strategies.put("*", new MultStrategy());
//        strategies.put("/", new DivStrategy());

    }

    public int calculate(String operation, int x, int y) throws RuntimeException {


        OperationStrategy strategy = strategies.get(operation);

        if (strategy == null) throw new RuntimeException("Apperation not allowed!");
        return strategy.calculate(x, y);

//        throw new IOException("Wrong operation");
        /*
        if (operation.equals("+")) {
            return x + y;
        } else if (operation.equals("-")) {
            return x - y;
        } else if (operation.equals("*")) {
            return x * y;
        } else if (operation.equals("/")) {
            return x / y;
        } else
            throw new IOException("Wrong operation");
*/
    }

}
