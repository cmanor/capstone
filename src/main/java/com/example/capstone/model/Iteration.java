package com.example.capstone.model;

import javax.persistence.*;

@Entity
@Table(name="Iteration")
public class Iteration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long taskId;
    private Long userId;
    private Long iterationNumber;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getIterationNumber() {
        return iterationNumber;
    }

    public void setIterationNumber(Long iterationNumber) {
        this.iterationNumber = iterationNumber;
    }
}
