package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/22/17.
 */

public class Ward {
    public ArrayList<Room> rooms;
    public int capacity;
    public Gender gender;


    public Ward(Gender gender){
        this.rooms = new ArrayList<Room>();
        this.capacity = 10;
        this.gender = gender;
    }

    public ArrayList<Room> getRooms  () {
            return rooms;
    }
    public Gender getGender() {
        return gender;
    }

    public int getCapacity() {
        return capacity;
    }



}




