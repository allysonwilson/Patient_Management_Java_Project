package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Ward {
    public ArrayList<Patient> room;
    public int capacity;


    public Ward( int capacity ){
        this.room = new ArrayList<>();
        this.capacity = capacity;
    }

    public ArrayList<Patient> getRoom() {
        return room;
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
        room.remove( patient);
    }
}



//extension make multiple rooms, designate female/male-Test won't admit wrong gender