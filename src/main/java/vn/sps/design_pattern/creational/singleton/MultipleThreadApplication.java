package vn.sps.design_pattern.creational.singleton;

public class MultipleThreadApplication {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());

        firstThread.start();
        secondThread.start();
        /**
         * We expect same value will be print ( that mean only instance of ThreadSafeSingleton class created)
         */
    }

    private static class FirstThread implements Runnable {

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.println(threadSafeSingleton.value);
        }
    }

    private static class SecondThread implements Runnable {

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.println(threadSafeSingleton.value);
        }
    }
}
