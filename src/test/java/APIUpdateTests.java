import Models.PatchModel;
import Models.PutModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import endpoints.Endpoints;
import endpoints.Routes;
import io.restassured.response.Response;
import org.junit.*;
import utilities.JsonUtils;

import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class APIUpdateTests {

    @BeforeClass
    public static void init() {
        System.out.println("Here should be code executed for WHOLE class BEFORE ALL test methods");
    }

    @Before
    public void setUp() {
        System.out.println("Here should be code executed for EACH method BEFORE test methods");
    }

    @Test
    public void updateUserEntirely() throws IOException {
        Map<String,Object> jsonObject = JsonUtils.getJsonDataAsMap("put_update_request.json");
        Response response = Endpoints.updateUser(Routes.put_patch_delete_url, jsonObject, "put");
        assertThat(response.getStatusCode()).isEqualTo(200);

        ObjectMapper objectMapper = new ObjectMapper();
        PutModel ptm = objectMapper.readValue(response.getBody().asString(), PutModel.class);
    }

    @Test
    public void updateUserPartially() throws IOException {
        Map<String,Object> jsonObject = JsonUtils.getJsonDataAsMap("patch_update_request.json");
        Response response = Endpoints.updateUser(Routes.put_patch_delete_url, jsonObject, "patch");
        assertThat(response.getStatusCode()).isEqualTo(200);

        ObjectMapper objectMapper = new ObjectMapper();
        PatchModel ptchm = objectMapper.readValue(response.getBody().asString(), PatchModel.class);
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

