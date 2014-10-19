package lv.nikolay.designpatterns.creationaldesignpatterns.singleton;

public class SingletonExample {
    private static SingletonExample instance;

    public static synchronized SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
}