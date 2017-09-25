package com.example.patientmanagement;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 9/25/17.
 */

public class NutritionTest {
    Nutrition nutrition;
    Ward ward;
    Patient patient1;
    Patient patient2;
    Patient patient3;


    @Before
    public void before(){
        ward = new Ward();
        nutrition = new Nutrition();

        patient1 = new Patient("Jill", Status.ADMITTED, Gender.FEMALE, 25, 100) ;
        ward.admitPatient( patient1 ); ;

        patient2 = new Patient("Kirsty", Status.ADMITTED, Gender.FEMALE, 26, 75) ;
        ward.admitPatient( patient2 ); ;

        patient3 = new Patient("Adele", Status.ADMITTED, Gender.FEMALE, 27, 80) ;
        ward.admitPatient( patient3 ); ;

    }

    @Test
    public void mealDeliveryIncreasesWardsHealth(){

        nutrition.serveMealsTo( ward );
        assertEquals(120, patient1.getHealth() );
        assertEquals(95, patient2.getHealth() );
        assertEquals(100, patient3.getHealth() );


    }
}
