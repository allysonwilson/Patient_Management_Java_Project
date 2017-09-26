package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/23/17.
 */

public class Nutrition {
    public Nutrition(){}


  public void serveMealsTo(Ward ward)  {
      for (Patient patient: ward.rooms){
          patient.eat( 20 );
      }
  }


}


