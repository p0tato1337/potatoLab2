package pl.example.spring.potatoLab2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, time is: "+ LocalDateTime.now();

    }
}
