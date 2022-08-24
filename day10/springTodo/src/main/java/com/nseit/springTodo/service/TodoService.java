package com.nseit.springTodo.service;

import com.nseit.springTodo.model.Todo;
import com.nseit.springTodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public void addTodo(Todo todo) {
//        ArrayList<Todo> todos = todoRepository.getTodos();
//        todos.add(todo);
//        todoRepository.getTodos().add(todo);

        todoRepository.save(todo);
    }

    public void viewTodo() {
//        ArrayList<Todo> todos = todoRepository.getTodos();
        List<Todo> todos = todoRepository.findAll();
        for (Todo todo : todos) {
            System.out.println(todo.getId() + ". " + todo.getItem() + " - " + todo.getCompleted());
        }

    }

    public void updateTodo(Todo todo) {
        todoRepository.save(todo);
//        ArrayList<Todo> todos = todoRepository.getTodos();
//        for (Todo todo : todos) {
//            if (todo.getId() == id) {
//                todo.setCompleted(true);
//                break;
//            }
//        }
    }

    public void deleteTodo(Todo todo) {
        todoRepository.delete(todo);
//        ArrayList<Todo> todos = todoRepository.getTodos();
//        for (Todo todo : todos) {
//            if (todo.getId() == id) {
//                todos.remove(todo);
//                break;
//            }
//        }
    }

}
