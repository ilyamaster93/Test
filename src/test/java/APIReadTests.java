import com.fasterxml.jackson.core.JsonProcessingException;
import endpoints.Endpoints;
import endpoints.Routes;
import io.restassured.response.Response;
import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;

public class APIReadTests {

    @BeforeClass
    public static void init() {
        System.out.println("Here should be code executed for WHOLE class BEFORE ALL test methods");
    }

    @Before
    public void setUp() {
        System.out.println("Here should be code executed for EACH method BEFORE test methods");
    }

    @Test
    public void getUsersList() throws JsonProcessingException {
        Response response = Endpoints.getListOfUsers(Routes.get_url);
        assertThat(response.getStatusCode()).isEqualTo(200);
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
