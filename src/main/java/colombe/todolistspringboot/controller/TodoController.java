package colombe.todolistspringboot.controller;

import colombe.todolistspringboot.entity.Todo;
import colombe.todolistspringboot.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    private final TodoService service = new TodoService();

    @GetMapping("/ping")
    public String ping() {
        return "The sh*t is working!";
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return service.getAll();
    }

}
