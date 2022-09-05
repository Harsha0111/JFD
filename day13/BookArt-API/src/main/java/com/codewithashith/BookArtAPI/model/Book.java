package com.codewithashith.BookArtAPI.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String bookName;
    private String authorName;
    private String bookDescription;
    private Integer price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Cart> carts;

    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Order> orders;
}
