package vn.sps.oops.shared;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GenericJson {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void toPrettyString() {
        try {
            String value = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(this);
            System.out.println(value);
        } catch (JsonProcessingException ignored) {
        }
    }
}
