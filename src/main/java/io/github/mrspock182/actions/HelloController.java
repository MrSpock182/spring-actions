package io.github.mrspock182.actions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final String name;

    public HelloController(@Value("${actions.name}") String name) {
        this.name = name;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Olá " + name + ", com você esta?";
    }
}