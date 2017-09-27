package com.example.patientmanagement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by allysonwilson on 9/26/17.
 */

public class Hospital {

    private HashMap< String, Ward> wards;


    public Hospital() {
        wards = new HashMap<>();

    }

    public HashMap<String, Ward> getWards() {
        return wards;
    }

    public void addWard(String name, Ward ward){
        wards.put(name, ward);
    }



}

















// addWard
// use "instanceof" operator while retrieving the values from MAP.


//    private boolean hospitalHasMaternityWard() {
//        hospital.containsKey();
//
//    }