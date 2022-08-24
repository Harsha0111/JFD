package com.nseit.springTodo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Integer id;
    private String item;
    private Boolean completed;
}
