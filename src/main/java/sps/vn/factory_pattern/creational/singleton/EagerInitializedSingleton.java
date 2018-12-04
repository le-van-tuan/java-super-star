package sps.vn.factory_pattern.creational.singleton;

/**
 * Eager initialized singleton - single thread!
 */
public class EagerInitializedSingleton {

    private static EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    public  String value;

    private EagerInitializedSingleton() {
        this.value = "Eager";
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}
