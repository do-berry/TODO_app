package com.application.todolist.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class List {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer list_id;

    private String name;

    private LocalDate date;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name="user")
    private Integer user_id;

    public Integer getList_id() {
        return list_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
