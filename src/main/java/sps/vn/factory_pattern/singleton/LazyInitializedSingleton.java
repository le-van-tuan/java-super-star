package sps.vn.factory_pattern.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton INSTANCE;

    public String value;

    private LazyInitializedSingleton(String value) {
        this.value = value;
    }

    public static LazyInitializedSingleton getDataBaseConnection(String value) {
        if (INSTANCE == null) {
            INSTANCE = new LazyInitializedSingleton(value);
        }
        return INSTANCE;
    }
}
