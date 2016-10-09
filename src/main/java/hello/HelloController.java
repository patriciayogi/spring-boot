package hello;
// cd C:\Users\pyogi\workspace\spring-boot
//mvn package && java -jar target/gs-spring-boot-0.1.0.jar
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}