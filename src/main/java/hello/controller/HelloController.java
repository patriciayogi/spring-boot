package hello.controller;
// cd C:\Users\pyogi\workspace\spring-boot
//mvn package && java -jar target/gs-spring-boot-0.1.0.jar
import hello.beans.Hello;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Spring Boot template!";
    }

    @RequestMapping("/hello")
    public String hello(@RequestBody @Valid Hello hello) {
        return hello.getMessage();
    }


}