package com.example.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //SpringBootTutorialApplication class Rest controller( request handler)
public class SpringBootTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping("/hello") //Get request for /hello
    public String sayHello(@RequestParam(value = "myName" /* web request parameter */, defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
