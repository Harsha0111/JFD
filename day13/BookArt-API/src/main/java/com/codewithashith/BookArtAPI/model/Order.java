package com.codewithashith.BookArtAPI.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer order_id;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private BookUser bookUser;

    @ManyToMany
    @JoinTable(
            name = "ordered_books",
            joinColumns = @JoinColumn(name = "order_id", referencedColumnName = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> books;

}
