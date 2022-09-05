package com.codewithashith.BookArtAPI.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private BookUser bookUser;

    @ManyToMany
    @JoinTable(
            name = "cart_books",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> books;
}
