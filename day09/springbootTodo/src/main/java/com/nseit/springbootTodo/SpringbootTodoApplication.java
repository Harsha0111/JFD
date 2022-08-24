package com.nseit.springbootTodo;

import com.nseit.springbootTodo.model.Todo;
import com.nseit.springbootTodo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringbootTodoApplication implements CommandLineRunner {

    @Autowired
public TodoService todoService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTodoApplication.class, args);


    }

    @Override
    public void run(String... args) throws Exception {
        Todo todo1 = new Todo(1, "hjgaui", false);
        Todo todo2 = new Todo(2, "iuryiury", false);
        Todo todo3 = new Todo(3, "uyteiuw", false);
        todoService.addTodo(todo1);
		todoService.addTodo(todo2);
		todoService.addTodo(todo3);

		todoService.viewTodo();
		todoService.updateTodo(2);
		todoService.updateTodo(3);
		todoService.removeTodo(1);
    }

}
