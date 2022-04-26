package vn.sps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DummySpringApplication {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(DummySpringApplication.class);
    }
}
