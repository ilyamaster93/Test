import endpoints.Endpoints;
import endpoints.Routes;
import io.restassured.response.Response;
import org.junit.*;
import utilities.JsonUtils;

import java.io.IOException;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class APITests {

    @BeforeClass
    public static void init() {
        System.out.println("Here should be code executed for WHOLE class BEFORE ALL test methods");
    }

    @Before
    public void setUp() {
        System.out.println("Here should be code executed for EACH method BEFORE test methods");
    }

    @Test
    public void getUsersList() {
        Response response = Endpoints.getListOfUsers(Routes.get_url);
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test
    public void createUser() throws IOException {
        Map<String,Object> jsonObject = JsonUtils.getJsonDataAsMap("post_create_request.json");
        Response response = Endpoints.createUser(Routes.post_url, jsonObject);
        assertThat(response.getStatusCode()).isEqualTo(201);
    }

    @Test
    public void updateUserEntirely() throws IOException {
        Map<String,Object> jsonObject = JsonUtils.getJsonDataAsMap("put_update_request.json");
        Response response = Endpoints.updateUser(Routes.put_patch_delete_url, jsonObject, "put");
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test
    public void updateUserPartially() throws IOException {
        Map<String,Object> jsonObject = JsonUtils.getJsonDataAsMap("patch_update_request.json");
        Response response = Endpoints.updateUser(Routes.put_patch_delete_url, jsonObject, "patch");
        assertThat(response.getStatusCode()).isEqualTo(200);
    }

    @Test
    public void deleteUser() {
        Response response = Endpoints.deleteUser(Routes.put_patch_delete_url);
        assertThat(response.getStatusCode()).isEqualTo(204);
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
