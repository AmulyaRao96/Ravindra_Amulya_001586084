/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ramulyarao
 */
public class VitalSigns {
    
   private float ageGroup;
   private int respiratoryRate;
   private int heartRate;
   private int sysBP;
   private float weightInKilos;
   private float weightInPounds;
   private Boolean PatientStatus;
   private Instant date;
   
  

    public float getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(float ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSysBP() {
        return sysBP;
    }

    public void setSysBP(int sysBP) {
        this.sysBP = sysBP;
    }

    public float getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(float weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public float getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(float weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    public Boolean getPatientStatus() {
        return PatientStatus;
    }

    public void setPatientStatus(Boolean PatientStatus) {
        this.PatientStatus = PatientStatus;
    }

    public Instant getDate() {
        Date date =new Date();
        return date.toInstant();
        
    }


   
    
}
