package colombe.todolistspringboot.service;

import colombe.todolistspringboot.entity.Todo;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class TodoService {
    public List<Todo> getAll(){
        Todo todo1= new Todo(1,"Eat","Bean Soup", Instant.parse("2025-08-12T11:34:35Z"),Instant.parse("2025-08-12T11:34:35Z"),false);
        Todo todo2= new Todo(2,"Dance","Hip Hop",Instant.parse("2025-08-12T11:34:35Z"),Instant.parse("2025-08-12T11:34:35Z"),true);
        Todo todo3= new Todo(3,"Sleep","You need to sleep",Instant.parse("2025-08-12T11:34:35Z"),Instant.parse("2025-08-12T11:34:35Z"),false);

        return Arrays.asList(todo1,todo2,todo3);
    }
}
