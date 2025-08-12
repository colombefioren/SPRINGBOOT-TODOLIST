package colombe.todolistspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    private TodoService service;

    @GetMapping("/ping")
    public String ping() {
        return "The sh*t is working!";
    }

    @GetMapping("/todos")
    public List<Todo> get1llTodos() {
        return service.getAll();
    }

}
