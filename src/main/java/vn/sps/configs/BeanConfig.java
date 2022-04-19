package vn.sps.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("singleton")
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    @Scope("prototype")
    public DummyProperties dummyProperties() {
        return new DummyProperties();
    }
}
