package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Ward {
    public ArrayList<Patient> room;
    public int capacity;
    public Gender gender;


    public Ward(Gender gender){
        this.room = new ArrayList<>();
        this.capacity = 10;
        this.gender = gender;
    }

    public ArrayList<Patient> getRoom() {
            return room;
    }
    public Gender getGender() {
        return gender;
    }

    public int getCapacity() {
        return capacity;
    }

    public void admitPatient(Patient patient) {
        if (room.size() < capacity) {
            room.add(patient);
        }

    }

    public void dischargePatient(Patient patient) {
        room.remove( patient );
    }

    public void admitCorrectGender(Patient patient) {
        if (patient.gender == this.gender) {
            room.add( patient );
        }
    }

}




