package com.example.patientmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class WardTest {

    Ward maternityWard;


    @Before
    public void before(){

        this.maternityWard = new Ward(Gender.FEMALE);
    }

    @Test
    public void roomStartsEmpty() {

        assertEquals(0, maternityWard.getRoom().size() );
    }

    @Test
    public void wardHasCapacity(){
        assertEquals( 10, maternityWard.getCapacity() );
    }

    @Test
    public void admitPatient(){
        Patient patient1 = new Patient("Jill", Status.ADMITTED, Gender.FEMALE, 25, 80);
        maternityWard.admitPatient(patient1 );

        assertEquals( 1, maternityWard.getRoom().size() );
    }

    @Test
    public void dischargePatient(){
        Patient patient1 = new Patient("Jill", Status.ADMITTED, Gender.FEMALE, 25, 100);
        maternityWard.admitPatient(patient1 );
        maternityWard.dischargePatient(patient1);
        assertEquals( 0 , maternityWard.getRoom().size() );
    }

    @Test
    public void cannotAdmitOverCapacity(){
        Patient patient1 = new Patient("Jill", Status.ADMITTED, Gender.FEMALE, 25, 100);
        Patient patient2 = new Patient("Kirsty", Status.ADMITTED, Gender.FEMALE, 26, 75);
        Patient patient3 = new Patient("Adele", Status.ADMITTED, Gender.FEMALE, 27, 80);
        Patient patient4 = new Patient("Ruth", Status.ADMITTED, Gender.FEMALE, 28, 85);
        Patient patient5 = new Patient("Eve", Status.ADMITTED, Gender.FEMALE, 29, 90);
        Patient patient6 = new Patient("Alice", Status.ADMITTED, Gender.FEMALE, 30, 100);
        Patient patient7 = new Patient("Gaby", Status.ADMITTED, Gender.FEMALE, 40, 65);
        Patient patient8 = new Patient("Barbra", Status.ADMITTED, Gender.FEMALE, 38, 75);
        Patient patient9 = new Patient("Adria", Status.ADMITTED, Gender.FEMALE, 36, 90);
        Patient patient10 = new Patient("Claire", Status.ADMITTED, Gender.FEMALE, 32, 75);
        Patient patient11 = new Patient("Sally", Status.ADMITTED, Gender.FEMALE, 18, 75);

        maternityWard.admitPatient(patient1);
        maternityWard.admitPatient(patient2);
        maternityWard.admitPatient(patient3);
        maternityWard.admitPatient(patient4);
        maternityWard.admitPatient(patient5);
        maternityWard.admitPatient(patient6);
        maternityWard.admitPatient(patient7);
        maternityWard.admitPatient(patient8);
        maternityWard.admitPatient(patient9);
        maternityWard.admitPatient(patient10);
        maternityWard.admitPatient(patient11);

        assertEquals( 10, maternityWard.getRoom().size() );
    }

    @Test
    public void CannotAdmitMaleToFemaleWard(){
        Patient patientMale = new Patient("Bill", Status.READY_FOR_DISCHARGE, Gender.MALE, 77, 40 );
        Patient patientFemale = new Patient("Sally", Status.ADMITTED, Gender.FEMALE, 18, 75);
        maternityWard.admitCorrectGender(patientFemale);
        maternityWard.admitCorrectGender(patientMale);
        assertEquals( 1, maternityWard.getRoom().size() );

    }
}



