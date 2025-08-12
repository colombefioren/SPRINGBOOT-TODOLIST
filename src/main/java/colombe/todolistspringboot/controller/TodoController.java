package colombe.todolistspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @GetMapping("/ping")
    public String ping() {
        return "The sh*t is working!";
    }
}
