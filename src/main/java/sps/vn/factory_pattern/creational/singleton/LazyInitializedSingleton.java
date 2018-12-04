package sps.vn.factory_pattern.creational.singleton;

/**
 * Lazy initialized singleton - single thread!
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton INSTANCE;

    public String value;

    private LazyInitializedSingleton(String value) {
        this.value = value;
    }

    public static LazyInitializedSingleton getInstance(String value) {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitializedSingleton(value);
        }
        return INSTANCE;
    }
}
