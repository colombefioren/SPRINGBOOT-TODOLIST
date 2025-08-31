package colombe.todolistspringboot.service;

import colombe.todolistspringboot.entity.Todo;
import colombe.todolistspringboot.repository.TodoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }
    public List<Todo> getAll() {
        return repository.findAll();
    }

    public Todo postTodo(Todo todo) {
        return repository.save(todo);
    }

    public void delete(int id) {
        Todo todo = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Todo not found"));
        repository.delete(todo);
    }
}
