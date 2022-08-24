package com.nseit.springbootTodo.service;

import com.nseit.springbootTodo.model.Todo;
import com.nseit.springbootTodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public void addTodo(Todo todo) {
        ArrayList<Todo> todos = todoRepository.getTodos();
        todos.add(todo);

    }

    public void viewTodo() {
        for (Todo todo : todoRepository.getTodos()) {
            System.out.println(todo.getId() + " - " + todo.getName() + "Complete Status" + (todo.isCompleted() ? "yes" : "no" + todo.getName()));
        }
    }

    public void updateTodo(int id) {
        for (Todo todo : todoRepository.getTodos()) {
            if (id == todo.getId()) {
                todo.setCompleted(true);
                break;
            }

            public void removeTod;( int id){
                for (Todo todo : todoRepository.getTodos()) {
                    if (id == todo.getId()) {
                        todoRepository.getTodos().remove(todo);
                        break;

                    }
                }
            }
        }
    }
}