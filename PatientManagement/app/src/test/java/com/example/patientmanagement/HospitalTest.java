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
    public void canAddWard(){


        assertEquals( true, hospital.isEmpty() );
    }













    
//    @Test
//    public void hospitalHasMaternityWard()
//            assertEquals( true, );


}
