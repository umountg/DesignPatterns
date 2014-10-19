package lv.nikolay.designpatterns.creationaldesignpatterns.objectpool;

/**
 * Created with IntelliJ IDEA.
 * User: MumboJumbo
 * Date: 7/17/13
 * Time: 7:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    private static ConnectionPool connectionPool;

    public static void main(String[] args) {
        createPool();
        Poolable con =  connect();
        Poolable con1 =  connect();
//        Poolable con2 =  connect();
//        Poolable con3 =  connect();
        disconnect(con);

    }

    public static void createPool() {
        connectionPool = new ConnectionPool(2);

    }

    public static Poolable connect() {
        Poolable clientConnection = connectionPool.get();
        if (clientConnection != null) {
            return clientConnection;
        } else
             throw new RuntimeException("No more connections!");
    }

    public static void disconnect(Poolable con) {
        connectionPool.release(con);
    }

}
