package lv.nikolay.designpatterns.creationaldesignpatterns.objectpool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private List<Poolable> connections;

    public ConnectionPool(int capacity) {
        connections = new ArrayList<Poolable>(capacity);
        for (int i = 0; i < capacity; i++) {
            Connection con = new Connection();
            connections.add(con);
        }
    }

    public synchronized Poolable get() {
        if (connections.isEmpty()) {
            throw new RuntimeException("Emty pool!");
        } else {
            Poolable con = connections.get(0);
            connections.remove(0);
            return con;
        }

    }

    public synchronized void release(Poolable con) {
        con.clear();
        connections.add(con);
    }
}
