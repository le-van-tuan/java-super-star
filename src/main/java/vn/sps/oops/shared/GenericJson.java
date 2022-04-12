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

    public static <T> T deepCopy(Object source, Class<T> type) throws JsonProcessingException {
        String jsonStr = objectMapper.writeValueAsString(source);
        return objectMapper.readValue(jsonStr, type);
    }

    public <T> T deepCopy(Class<T> type) throws JsonProcessingException {
        return deepCopy(this, type);
    }
}
