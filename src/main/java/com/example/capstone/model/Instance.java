package com.example.capstone.model;

import javax.persistence.*;

@Entity
@Table(name = "instance")
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instanceId;


    private Long iteration;


    //should be System.currentTimeMillis() and auto-logged when button is pushed
    private Long startTime;

    //should be System.currentTimeMillis() and auto-logged when button is pushed
    private Long stopTime;


    //need to write the logic to calculate this and
    //then add it to the stop time button
    private Long duration;


            //need to find a way to link this to the tasKId
    private Long taskId;

    private long userId;




    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public Long getIteration() {
        return iteration;
    }

    public void setIteration(Long iteration) {
        this.iteration = iteration;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getStopTime() {
        return stopTime;
    }

    public void setStopTime(Long stopTime) {
        this.stopTime = stopTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
