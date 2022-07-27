package com.example.capstone.model;

import javax.persistence.*;

@Entity
@Table(name = "instance")
public class Instance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instanceId;


    //strategy generation type sequence?
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long iteration;


    //should be System.currentTimeMillis() and auto-logged when button is pushed
    private Long startTime;

    //should be System.currentTimeMillis() and auto-logged when button is pushed
    private Long stopTime;


    //need to write the logic to calculate this and
    //then add it to the stop time button
    private Long duration;


            //need to find a way to link this to the tasKId
    private Long TaskId;


}
