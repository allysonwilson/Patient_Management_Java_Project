package com.example.patientmanagement;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class PatientTest {

    Patient patient;

    @Before
    public void before(){ patient = new Patient("Bill", Status.READY_FOR_DISCHARGE, Gender.MALE, 77 ) ; }

    @Test
    public void hasName(){
        assertEquals("Bill",  patient.getName() );
    }

    @Test
    public void hasStatus(){
        assertEquals(Status.READY_FOR_DISCHARGE, patient.getStatus());
    }

    @Test
    public void hasGender(){
        assertEquals(Gender.MALE, patient.getGender());
    }

    @Test
    public void hasAge() {
        assertEquals(77, patient.getAge());
    }

}
