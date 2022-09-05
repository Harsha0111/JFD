package com.codewithashith.BookArtAPI.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Integer id;
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Book> books;
}
