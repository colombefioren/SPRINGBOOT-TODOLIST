package colombe.todolistspringboot.controller;

import colombe.todolistspringboot.entity.Todo;
import colombe.todolistspringboot.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    //@GetMapping("/ping")
    //public String ping() {
      //  return "The sh*t is working!";
   // }


    @GetMapping
    public List<Todo> getAllTodos() {
        return service.getAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo){
        return service.postTodo(todo);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.deleteTodo(id);
    }

}
