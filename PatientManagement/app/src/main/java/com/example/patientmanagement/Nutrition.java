package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/23/17.
 */

public class Nutrition {
    public int health;




  public int serveMealsTo(Ward ward)  {
      for (Patient patient: ward.room){
          patient.eat( 20 );
      }
      return health;
  }


}


