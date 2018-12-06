package vn.sps.threads;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

class SynchronizationApplicationTest {

    private static ExecutorService executorService;

    @BeforeAll
    static void setup(){
        executorService = Executors.newFixedThreadPool(3);
    }

    @Test
    void shouldErrorWhenMultipleThreadAreRunning() throws InterruptedException {
        SynchronizationApplication synchronizationApplication = new SynchronizationApplication();

        IntStream.range(0, 1000).forEach(count -> executorService.submit(synchronizationApplication::calculate));

        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        Assertions.assertEquals(1000, synchronizationApplication.getSum());
    }
}