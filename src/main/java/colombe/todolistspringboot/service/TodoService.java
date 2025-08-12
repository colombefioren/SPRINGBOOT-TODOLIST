package colombe.todolistspringboot.service;

import colombe.todolistspringboot.entity.Todo;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class TodoService {
    public List<Todo> getAll(){
        Todo todo1= new Todo(1,"Eat","Bean Soup", null,null,false);
        Todo todo2= new Todo(2,"Dance","Hip Hop",null,null,true);
        Todo todo3= new Todo(3,"Sleep","You need to sleep",null,null,false);

        return Arrays.asList(todo1,todo2,todo3);
    }
}
