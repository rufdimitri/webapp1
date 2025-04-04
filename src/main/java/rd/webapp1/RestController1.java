package rd.webapp1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RestController1 {
    @GetMapping("/api")
    public String api() {
        return """
               <h1>API documentation</h1>
               <ul>
                 <li>[host]/api - show this message</li>
               </ul>
                """;
    }
}
