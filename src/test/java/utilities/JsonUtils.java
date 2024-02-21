package utilities;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static Map<String, Object> getJsonDataAsMap(String jsonFileName) throws IOException {
        String completeJsonFilePath = System.getProperty("user.dir") + "/src/test/resources/requests/" + jsonFileName;
        return objectMapper.readValue(new File(completeJsonFilePath), new TypeReference<Map<String, Object>>(){});
    }
}
