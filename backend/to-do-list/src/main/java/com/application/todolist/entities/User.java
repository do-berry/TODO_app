package com.application.todolist.entities;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer user_id;

    private String username;

    private String name;

    private String password;

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {};

    public User(String username, String name, String password) {
        setUsername(username);
        setName(name);
        setPassword(password);
    }
}
