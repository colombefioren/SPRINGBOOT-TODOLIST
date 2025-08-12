package colombe.todolistspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Todo {
    private int id;
    private String title;
    private String description;
    private Instant startDatetime;
    private boolean done;
    private Instant endDatetime;
}
