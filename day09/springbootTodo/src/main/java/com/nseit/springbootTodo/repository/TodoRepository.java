package com.nseit.springbootTodo.repository;

import com.nseit.springbootTodo.model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Getter
@Repository

public class TodoRepository {
    private ArrayList<Todo> todos = new ArrayList<>();
}
