package com.example.patientmanagement;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by allysonwilson on 10/2/17.
 */

public class RoomTest {

    Room room1;

    @Before
    public void before(){
        this.room1 = new Room();
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals( 0, room1.getPatients().size() );
    }

    @Test
    public void canAdmitPatient(){
        Patient patient1 = new Patient("Jill", Status.ADMITTED, Gender.FEMALE, 25, 80);
        room1.admitPatients( patient1 );
        assertEquals( 1, room1.getPatients().size() );
    }

}
