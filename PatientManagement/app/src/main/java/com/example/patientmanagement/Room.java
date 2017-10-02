package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 10/2/17.
 */

public class Room {

    public ArrayList<Patient> patients;


    public Room(){
        this.patients = new ArrayList<>();
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void admitPatients(Patient patient) {
        patients.add(patient);
    }

}
////loop through to see if there are empty spaces


////    } public void admitPatient(Patient patient) {
//        if (rooms.size() < capacity) {
//        rooms.add(patient);
//        }
//
//        }
//
//public void dischargePatient(Patient patient) {
//        rooms.remove( patient );
//        }
//
//
//public void admitCorrectGender(Patient patient) {
//        if (patient.gender == this.gender) {
//        rooms.add( patient );
//        }
//        }
