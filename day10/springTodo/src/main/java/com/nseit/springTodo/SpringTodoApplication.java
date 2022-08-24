package com.nseit.springTodo;

import com.nseit.springTodo.model.Todo;
import com.nseit.springTodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTodoApplication implements CommandLineRunner {

    @Autowired
    private TodoService todoService;

    public static void main(String[] args) {
        SpringApplication.run(SpringTodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Todo todoOne = new Todo();
        todoOne.setId(2);
        todoOne.setItem("Todo 2");
        todoOne.setCompleted(false);

        Todo todoTwo = new Todo();
        todoTwo.setId(3);
        todoTwo.setItem("Todo 3");
        todoTwo.setCompleted(false);

        todoService.addTodo(todoOne);
        todoService.addTodo(todoTwo);

        todoOne.setCompleted(true);
        todoService.updateTodo(todoOne);

        todoService.deleteTodo(todoTwo);

        todoService.viewTodo();

    }
}
