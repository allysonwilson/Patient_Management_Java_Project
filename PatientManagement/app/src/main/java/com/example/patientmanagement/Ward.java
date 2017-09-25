package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Ward {
    public ArrayList<Patient> room;
    public int capacity;
    public Gender gender;

//if you don't add a number then it auto-sets the capacity to 10
    public Ward(){
        this.room = new ArrayList<>();
        this.capacity = 10;
        this.gender = Gender.FEMALE;
    }
//If you do enter a number it sets that number to the capacity
//    public Ward(int capacity){
//        this.room = new ArrayList<>();
//        this.capacity = capacity;
//        this.gender = Gender.MALE;
//    }

    public ArrayList<Patient> getRoom() {return room;
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

    public void adjustCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }
}



//extension make multiple rooms, designate female/male-Test won't admit wrong gender