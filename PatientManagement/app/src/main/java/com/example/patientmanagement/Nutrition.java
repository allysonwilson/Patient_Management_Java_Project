package com.example.patientmanagement;

import java.util.ArrayList;

/**
 * Created by allysonwilson on 9/23/17.
 */

public class Nutrition {


  public void serveMealsToWard(ArrayList<Patient> patients)  {
      for (Patient patient: patients){
          patient.eat( 20 );
      }
//      return
  }


}

//so all patients in ward's health should go up by 20 to test?
