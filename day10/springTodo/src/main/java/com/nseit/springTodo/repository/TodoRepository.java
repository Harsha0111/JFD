package com.nseit.springTodo.repository;

import com.nseit.springTodo.model.Todo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    public List<Todo> findAll() {
//        return jdbcTemplate.query("SELECT * FROM todo", (rs, rowNum) -> {
//            Todo todo = new Todo();
//            todo.setId(rs.getInt(1));
//            todo.setItem(rs.getString(2));
//            todo.setCompleted(rs.getBoolean(3));
//            return todo;
//        });
//    }
//
//    public int insert(Todo todo) {
//        return jdbcTemplate
//                .update("INSERT INTO todo (id, item, isCompleted) VALUES (?, ?, ?);",
//                        new Object[]{todo.getId(), todo.getItem(), todo.isCompleted()});
//    }
//
//    public int update(int id) {
//        return jdbcTemplate
//                .update("UPDATE todo SET isCompleted = TRUE WHERE id = ?;",
//                        new Object[]{id});
//    }
//
//    public int delete(int id) {
//        return jdbcTemplate
//                .update("DELETE FROM todo WHERE id = ?;",
//                        new Object[]{id});
//    }
}
