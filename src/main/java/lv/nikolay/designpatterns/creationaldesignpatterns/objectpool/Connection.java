package lv.nikolay.designpatterns.creationaldesignpatterns.objectpool;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/17/13
 * Time: 7:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Connection implements Poolable {
    @Override
    public void clear() {
       System.out.println("I am clear");
    }
}
