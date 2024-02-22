import Models.PostModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import endpoints.Endpoints;
import endpoints.Routes;
import io.restassured.response.Response;
import org.junit.*;
import utilities.JsonUtils;

import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class APICreateTests {

    @BeforeClass
    public static void init() {
        System.out.println("Here should be code executed for WHOLE class BEFORE ALL test methods");
    }

    @Before
    public void setUp() {
        System.out.println("Here should be code executed for EACH method BEFORE test methods");
    }

    @Test
    public void createUser() throws IOException {
        Map<String, Object> jsonObject = JsonUtils.getJsonDataAsMap("post_create_request.json");
        Response response = Endpoints.createUser(Routes.post_url, jsonObject);
        assertThat(response.getStatusCode()).isEqualTo(201);

        ObjectMapper objectMapper = new ObjectMapper();
        PostModel pm = objectMapper.readValue(response.getBody().asString(), PostModel.class);
    }

    @After
    public void cleanUp() {
        System.out.println("Here should be code executed for EACH method AFTER test methods");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Here should be code executed for WHOLE class AFTER ALL test methods");
    }
}