package sps.vn.factory_pattern.singleton;

public class SingletonApplication {
    public static void main(String[] args) {
        String firstValue = LazyInitializedSingleton.getDataBaseConnection("Test").value;
        String secondValue = LazyInitializedSingleton.getDataBaseConnection("Test2").value;

        /**
         * We expect same value is print here
         */
        System.out.println(firstValue);
        System.out.println(secondValue);
    }
}
