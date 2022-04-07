package vn.sps.design_pattern.creational.singleton;

/**
 * Thread safe singleton - It help application return only one Instance of class in multiple thread application
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        /**
         * This synchronized allow one thread at the time can access to this method.
         */
        synchronized (ThreadSafeSingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new ThreadSafeSingleton(value);
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        try {
            System.out.println("run");
            return;
        } finally {
            System.out.println("finally");
        }
    }
}
