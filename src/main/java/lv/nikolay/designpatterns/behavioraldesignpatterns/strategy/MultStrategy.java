package lv.nikolay.designpatterns.behavioraldesignpatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/17/13
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultStrategy implements OperationStrategy {
    public int calculate(int x, int y) {
        return x*y;
    }
}
