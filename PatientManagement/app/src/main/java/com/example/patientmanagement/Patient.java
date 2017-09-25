package com.example.patientmanagement;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Patient {

    private String name;
    private Status status;
    public Gender gender;
    private int age;
    private int health;

    public Patient (String name, Status status, Gender gender, int age, int health) {
        this.name = name;
        this.status = status;
        this.gender = gender;
        this.age = age;
        this.health = health;
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

    public int getHealth() {
        return health;
    }

    public void eat(int amount) { this.health += amount; }
}


