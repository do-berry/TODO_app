package com.application.todolist.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class List {
    @Id
    @Column(name="list_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer list_id;

    private String name;

    private LocalDate date;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name="user_id")
    private User user;

    public void setList_id(Integer list_id) {
        this.list_id = list_id;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List() {};

    public List(String name, User user) {
        setName(name);
        setUser(user);
        setDate(LocalDate.now());
    }
}
