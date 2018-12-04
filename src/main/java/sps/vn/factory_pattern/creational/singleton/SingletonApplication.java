package sps.vn.factory_pattern.creational.singleton;

public class SingletonApplication {
    public static void main(String[] args) {

        String firstValue = LazyInitializedSingleton.getInstance("Singleton").value;
        String secondValue = LazyInitializedSingleton.getInstance("Singleton-----2").value;

        /**
         * We expect same value is print here (lazy singleton - single thread)
         */
        System.out.println(firstValue);
        System.out.println(secondValue);

        /**
         * eager singleton - single thread
         */
        String firstValueEager = EagerInitializedSingleton.getInstance().value;
        System.out.println(firstValueEager);
    }
}
