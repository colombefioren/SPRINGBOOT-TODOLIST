package colombe.todolistspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Todo {
    private final int id;
    private final String title;
    private final String description;
    private final Instant startDatetime;
    private final Instant endDatetime;
    private final boolean done;
}
