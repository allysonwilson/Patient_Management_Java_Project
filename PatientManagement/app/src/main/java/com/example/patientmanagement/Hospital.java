package com.example.patientmanagement;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by allysonwilson on 9/26/17.
 */

public class Hospital {

    public Gender gender;
    Ward ward;
    private HashMap< String, Ward> hospital;


    public Hospital() {
        hospital = new HashMap<>();
        initHospital();
    }

    private void initHospital(){
        hospital.put("Maternity", ward);
        hospital.put("Critical Care", ward);
        hospital.put("Medical Surgical", ward);
        hospital.put("General Surgery", ward);
        hospital.put("Accident and Emergency", ward);
    }



//    private boolean hospitalHasMaternityWard() {
//        hospital.containsKey();
//
//    }


}

// use "instanceof" operator while retrieving the values from MAP.