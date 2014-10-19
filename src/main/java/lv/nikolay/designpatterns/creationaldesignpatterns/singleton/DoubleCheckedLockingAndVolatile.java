package lv.nikolay.designpatterns.creationaldesignpatterns.singleton;


public class DoubleCheckedLockingAndVolatile {
    private static volatile DoubleCheckedLockingAndVolatile instance;

    public static DoubleCheckedLockingAndVolatile getInstance() {
        DoubleCheckedLockingAndVolatile localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingAndVolatile.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedLockingAndVolatile();
                }
            }
        }
        return localInstance;
    }
}