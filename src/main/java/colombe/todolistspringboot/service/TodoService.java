package colombe.todolistspringboot.service;

import colombe.todolistspringboot.entity.Todo;
import colombe.todolistspringboot.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }
    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    public Todo saveTodo(Todo todo) {
        return repository.save(todo);
    }

    public void deleteTodo(Integer id) {
        repository.deleteById(id);
    }

}
