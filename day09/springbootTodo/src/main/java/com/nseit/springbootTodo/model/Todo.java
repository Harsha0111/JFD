package com.nseit.springbootTodo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Todo {
    private int id;
    private String name;
    boolean isCompleted;
}
