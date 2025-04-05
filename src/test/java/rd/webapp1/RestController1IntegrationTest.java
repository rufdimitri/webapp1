package rd.webapp1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestController1IntegrationTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void testApi() throws Exception {
        ResponseEntity<String> response = template.getForEntity("/api", String.class);
        assertThat(response.getBody()).containsSequence("API documentation");
    }
}
