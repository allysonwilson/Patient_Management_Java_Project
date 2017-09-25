package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/23/17.
 */

public class Nutrition {


  public void serveMealsToRoom(ArrayList<Patient> patients)  {
      for (Patient patient: patients){
          patient.eat();
      }
  }


}
