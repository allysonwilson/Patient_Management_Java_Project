package com.example.patientmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/26/17.
 */

public class HospitalTest {

    Hospital hospital;


    @Before
    public void before(){
       this.hospital = new Hospital();

    }

    @Test
    public void hospitalStartsEmpty(){

        assertEquals( true , hospital.getWards().isEmpty() );
    }

    @Test
    public void canAddWard(){
        Ward ward = new Ward(Gender.UNISEX);
        hospital.addWard("Accident and Emergency", ward);
        assertEquals( ward , hospital.getWards().get("Accident and Emergency"));
    }














}
