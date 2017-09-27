package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Ward {
    public ArrayList<Patient> rooms;
    public int capacity;
    public Gender gender;


    public Ward(Gender gender){
        this.rooms = new ArrayList<>();
        this.capacity = 10;
        this.gender = gender;
    }

    public ArrayList<Patient> getRooms  () {
            return rooms;
    }
    public Gender getGender() {
        return gender;
    }

    public int getCapacity() {
        return capacity;
    }

    public void admitPatient(Patient patient) {
        if (rooms.size() < capacity) {
            rooms.add(patient);
        }

    }

    public void dischargePatient(Patient patient) {
        rooms.remove( patient );
    }

    public void admitCorrectGender(Patient patient) {
        if (patient.gender == this.gender) {
            rooms.add( patient );
        }
    }

}




