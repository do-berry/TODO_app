package com.application.todolist.entities;

import javax.persistence.*;

@Entity
public class Task {
    @Id
    @Column(name="task_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer task_id;

    private String description;

    private Boolean isDone;

    @ManyToOne(targetEntity = List.class)
    @JoinColumn(name="list_id")
    private List list;

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

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Task() {};

    public Task(String description, List list) {
        setDescription(description);
        setList(list);
    }
}
