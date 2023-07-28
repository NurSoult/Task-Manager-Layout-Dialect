package kz.bitlab.task41.db;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Task {

    private Long id;
    private String name;
    private String deadlineDate;
    private boolean isCompleted;
    private String description;

}
