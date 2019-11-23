package com.application.todolist.entities;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer task_id;

    private String description;

    private Boolean isDone;

    @ManyToOne(targetEntity = List.class)
    @JoinColumn(name="list")
    private Integer list_id;

    public Integer getTask_id() {
        return task_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public Integer getList_id() {
        return list_id;
    }

    public void setList_id(Integer list_id) {
        this.list_id = list_id;
    }
}
