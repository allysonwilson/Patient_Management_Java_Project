package com.example.patientmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class WardTest {

    Ward ward;

//    @Before
//    public void before(){ room = new Room(); }

//    @Test
//    public void bedsAvailable


    @Test
    public void roomStartsEmpty(){


    }

    @Test
    public void admitPatient(){
//        arrange
        ArrayList<Patient> room = new ArrayList<>();
        Patient patient = new Patient();
//        act
        ArrayList<Patient> admission = room.add(patient);
//        assert
        assertEquals();
    }

}

//capacity ward has 4 rooms with 4 beds each total capacity = 16