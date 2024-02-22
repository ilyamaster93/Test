import endpoints.Endpoints;
import endpoints.Routes;
import io.restassured.response.Response;
import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

public class APIDeleteTests {

    @BeforeClass
    public static void init() {
        System.out.println("Here should be code executed for WHOLE class BEFORE ALL test methods");
    }

    @Before
    public void setUp() {
        System.out.println("Here should be code executed for EACH method BEFORE test methods");
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
