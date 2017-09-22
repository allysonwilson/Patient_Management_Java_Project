package com.example.patientmanagement;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Patient {

    private String name;
    private Status status;
    private Gender gender;

    public Patient (Status status, Gender gender) {
        this.status = status;
        this.gender = gender;

    }


}


