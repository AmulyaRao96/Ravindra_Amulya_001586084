/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ramulyarao
 */
public class Patient {

    private int patientid;
    private String patientname;

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }
    

  
ArrayList<VitalSigns> vitalsignsHistory=new ArrayList<VitalSigns>();

    
    public boolean ispatientNormal(VitalSigns vs) {
        if((vs.getAgeGroup().equals("NewBorn")) && 
                (vs.getRespiratoryRate() >= 30 && vs.getRespiratoryRate() <=50) && (vs.getHeartRate() >= 120 && vs.getHeartRate() <= 160) && 
                    (vs.getSysBP() >= 50 && vs.getSysBP() <= 70) &&(vs.getWeightInKilos() >= 2 && vs.getWeightInKilos() <= 3) && (vs.getWeightInPounds() >= 4.5 && vs.getWeightInPounds() <= 7.)){
            return true;
        } else if((vs.getAgeGroup().equals("Infant")) && 
                (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <=30) && (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 140) && 
                    (vs.getSysBP() >= 70 && vs.getSysBP() <= 100) &&(vs.getWeightInKilos() >= 4 && vs.getWeightInKilos() <= 10) && (vs.getWeightInPounds()>= 9 && vs.getWeightInPounds() <= 22)){
            return true;
        } else if((vs.getAgeGroup().equals("Toddler")) && 
                (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <=30) && (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 130) && 
                    (vs.getSysBP() >=80 && vs.getSysBP() <= 110) &&(vs.getWeightInKilos() >= 10 && vs.getWeightInKilos()<= 14) && (vs.getWeightInPounds() >= 22 && vs.getWeightInPounds() <=31 )){
            return true;
        }else if((vs.getAgeGroup().equals("Preschooler")) && 
                (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <=30) && (vs.getHeartRate() >=80 && vs.getHeartRate() <= 120) && 
                    (vs.getSysBP() >=80 && vs.getSysBP() <= 110) &&(vs.getWeightInKilos() >=14 && vs.getWeightInKilos() <= 18) && (vs.getWeightInPounds() >= 31 && vs.getWeightInPounds() <=40 )){
            return true;
        }else if((vs.getAgeGroup().equals("Schoolage")) && 
                (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <=30) && (vs.getHeartRate() >= 70 && vs.getHeartRate() <= 110) && 
                    (vs.getSysBP() >= 80 && vs.getSysBP() <= 120) &&(vs.getWeightInKilos()>= 20 && vs.getWeightInKilos() <= 42) && (vs.getWeightInPounds() >= 41 && vs.getWeightInPounds()<=92 )){
            return true;
        }else if((vs.getAgeGroup().equals("adoloscent")) && 
                (vs.getRespiratoryRate() >= 12 && vs.getRespiratoryRate() <=20) && (vs.getHeartRate() >= 55 && vs.getHeartRate() <= 105) && 
                    (vs.getSysBP() >= 110 && vs.getSysBP() <= 120) &&(vs.getWeightInKilos() > 50) && (vs.getWeightInKilos() > 110)){
            return true; 
        } 
        
       return false;
          
    }

    public static boolean isThisVitalSignNormal(VitalSigns vs, String type) {
        if(type.equalsIgnoreCase("Respiratory Rate")){
            if((vs.getAgeGroup().equalsIgnoreCase("NewBorn")) && (vs.getRespiratoryRate() >= 30 && vs.getRespiratoryRate() <= 50)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Infant")) && (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Toddler")) && (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <= 30)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Preschooler")) && (vs.getRespiratoryRate() >=20 && vs.getRespiratoryRate() <= 30)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Schoolage")) && (vs.getRespiratoryRate() >= 20 && vs.getRespiratoryRate() <=30)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Adoloscent")) && (vs.getRespiratoryRate() >= 12 && vs.getRespiratoryRate() <= 20)){
                return true;
            }
        }else if (type.equalsIgnoreCase("Heart Rate")){
            if((vs.getAgeGroup().equalsIgnoreCase("NewBorn")) && (vs.getHeartRate() >= 120 && vs.getHeartRate() <= 160)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Infant")) && (vs.getHeartRate() >=80 && vs.getHeartRate() <= 140)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Toddler")) && (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 130)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Preschooler")) && (vs.getHeartRate() >= 80 && vs.getHeartRate() <= 120)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Schoolage")) && (vs.getHeartRate() >= 70 && vs.getHeartRate() <= 110)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Adoloscent")) && (vs.getHeartRate() >= 55 && vs.getHeartRate() <= 105)){
                return true;
            } 
        }else if (type.equalsIgnoreCase("Blood Pressure")){
            if((vs.getAgeGroup().equalsIgnoreCase("NewBorn")) && (vs.getSysBP()>= 50 && vs.getSysBP() <= 70)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Infant")) && (vs.getSysBP()>= 70 && vs.getSysBP() <= 100)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Toddler")) && (vs.getSysBP()>= 80 && vs.getSysBP() <= 110)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Preschooler")) && (vs.getSysBP()>= 80 && vs.getSysBP() <= 110)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Schoolage")) && (vs.getSysBP()>= 80 && vs.getSysBP() <= 120)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Adoloscent")) && (vs.getSysBP()>= 110 && vs.getSysBP() <= 120)){
                return true;
            }
        }else if (type.equalsIgnoreCase("Weight in Kg")){
            if((vs.getAgeGroup().equalsIgnoreCase("NewBorn")) && (vs.getWeightInKilos() >= 2 && vs.getWeightInKilos() <= 3)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Infant")) && (vs.getWeightInKilos() >= 4 && vs.getWeightInKilos()<= 10)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Toddler")) && (vs.getWeightInKilos() >= 10 && vs.getWeightInKilos() <= 14)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Preschooler")) && (vs.getWeightInKilos() >= 14 && vs.getWeightInKilos() <= 18)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Schoolage")) && (vs.getWeightInKilos()>= 20 && vs.getWeightInKilos() <= 42)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Adoloscent")) && (vs.getWeightInKilos() > 50)){
                return true;
            }
        }else if (type.equalsIgnoreCase("Weight in Pounds")){
            if((vs.getAgeGroup().equalsIgnoreCase("NewBorn")) && (vs.getWeightInPounds() >= 4.5 && vs.getWeightInPounds() <= 7)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Infant")) && (vs.getWeightInPounds() >= 9 && vs.getWeightInPounds() <= 22)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Toddler")) && (vs.getWeightInPounds() >= 22 && vs.getWeightInPounds() <=31)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Preschooler")) && (vs.getWeightInPounds() >= 31 && vs.getWeightInPounds() <= 40)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Schoolage")) && (vs.getWeightInPounds() >= 41 && vs.getWeightInPounds() <= 92)){
                return true;
            }else if((vs.getAgeGroup().equalsIgnoreCase("Adoloscent")) && (vs.getWeightInPounds() > 110)){
                return true;
            }
        }
        return false;
   }
}
