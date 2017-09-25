package com.example.patientmanagement;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Patient {

    private String name;
    private Status status;
    private Gender gender;
    private int age;

    public Patient (String name, Status status, Gender gender, int age) {
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}


