/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ramulyarao
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Patient> p = new ArrayList<Patient>();
        int patientId = 2;
        Boolean patientStatus = false;
        Boolean Patientnull = false;
        Patient patient = new Patient();
        while (true){
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please Enter your Choice: ");
        System.out.println("Enter");
        System.out.println("Verify");
        System.out.println("History ");
        System.out.println("End");
       
        String userInput = scan.next();
        
        if (userInput.equalsIgnoreCase("Enter")){
            
            VitalSigns vs = new VitalSigns();
            System.out.println("Is this patient Existing ? (Yes/No)");
            String addStatus = scan.next();
            
            if(addStatus.equalsIgnoreCase("yes") || addStatus.equalsIgnoreCase("no")){
                if(addStatus.equalsIgnoreCase("no")){  
                    System.out.println("Patient Name: ");
                    String name = scan.next();
                    patient.setPatientname(name);
                    patientId = patientId+1;
                    patient.setPatientid(patientId);

                    System.out.println("Patient ID : "+ patientId);

                    System.out.println("Enter the Age Group: ");
                    String age = scan.next();
                    vs.setAgeGroup(age);

             
                    System.out.println("Enter Patient Detail ");
                   

                    System.out.println("Enter the  Respiratory Rate: ");
                    vs.setRespiratoryRate(scan.nextInt());

                    System.out.println("Enter the Heart Rate: ");
                    vs.setHeartRate(scan.nextInt());

                    System.out.println("Enter the Blood Pressure: ");
                    vs.setSysBP(scan.nextInt());

                    System.out.println("Enter the Weight(Kgs): ");
                    vs.setWeightInKilos(scan.nextFloat());

                    System.out.println("Enter the Weight(Pounds): ");
                    vs.setWeightInPounds(scan.nextFloat());

                    boolean ispatientNormal = patient.ispatientNormal(vs);
                    vs.setPatientStatus(ispatientNormal);
                    patient.vitalsignsHistory.add(vs);
                    p.add(patient);

                    
                    System.out.println("Is Patient Normal?: ");
                    System.out.println(ispatientNormal);
                    System.out.println(" Check the individual Vital Signs?? (Yes/ No)");
                    String uservalue = scan.next();
                    if(!uservalue.toLowerCase().equals("yes") && !uservalue.toLowerCase().equals("no")){
                        System.out.println("Please enter Yes/ No");
                        uservalue = scan.next();
                    }
                    if (uservalue.toLowerCase().equals("yes")) {
                        System.out.println("Enter the Vital Sign: ");
                        String VitalSigns = scan.nextLine();
                        VitalSigns+=scan.nextLine();
                        VitalSigns = VitalSigns.toLowerCase();

                        boolean normal = Patient.isThisVitalSignNormal(vs, VitalSigns);

                        
                        System.out.println("Is this " + VitalSigns +" Normal: ");
                        System.out.println(normal);
                        
                    }  
                }else{
                    System.out.println("Please Enter Patient ID: ");
                    int patientID = scan.nextInt();
                    if(p.size() != 0){
                        for(int i=0;i < p.size() ;i++){
                    if(p.get(i).getPatientid() == patientID){
                    System.out.println("Enter the Age Group: ");
                    String ages = scan.next();
                    vs.setAgeGroup(ages);
                    
                    
                    System.out.println("Enter Patient Detail ");
                   

                    System.out.println("Enter Respiratory Rate: ");
                    vs.setRespiratoryRate(scan.nextInt());

                    System.out.println("Enter Heart Rate: ");
                    vs.setHeartRate(scan.nextInt());

                    System.out.println("Enter systolic  Blood Pressure: ");
                    vs.setSysBP(scan.nextInt());

                    System.out.println("Enter Weight(Kgs): ");
                    vs.setWeightInKilos(scan.nextFloat());

                    System.out.println("Enter Weight(Pounds): ");
                    vs.setWeightInPounds(scan.nextFloat());
                    
                    boolean ispatientNormal = patient.ispatientNormal(vs);
                    vs.setPatientStatus(ispatientNormal);
                    
                    
                    p.get(i).vitalsignsHistory.add(vs);

                    System.out.println("Is the Patient Normal: ");
                    System.out.println(ispatientNormal);
                    System.out.println(" Check the individual Vital Signs?? (Yes/ No)");
                    String uservalue = scan.next();
                        if(!uservalue.toLowerCase().equals("yes") && !uservalue.toLowerCase().equals("no")){
                            System.out.println("Please enter either  Yes/ No");
                            uservalue = scan.next();
                        }
                        if (uservalue.toLowerCase().equals("yes")) {
                            System.out.println("Enter the Vital Sign: ");
                            String vitalSigns = scan.nextLine();
                            vitalSigns+=scan.nextLine();
                            vitalSigns = vitalSigns.toLowerCase();

                            boolean normal = Patient.isThisVitalSignNormal(vs, vitalSigns);
                            System.out.println("Is the " + uservalue +" Normal: ");
                            System.out.println(normal);
                            
                        }  
                    }else{
                        System.out.println("PatientID does not Exist");
                    }    
                }
                    }else{
                    System.out.println("Enter the patient to the record !!");
                }
                    
                
                }
            }
            
        }else if (userInput.equalsIgnoreCase("Verify")){
            System.out.println("Enter the PatientID:");
            int patientid = scan.nextInt();
            int number =0;
            for(int i=0;i < p.size() ;i++){
                if(p.get(i).getPatientid() == patientid){
                 number = i;  
                 break;
                }else{
                   Patientnull  = true;
                }     
            }
            if(Patientnull == false){
            patient = p.get(number);
            
            }else{
                System.out.println("PatientID does not Exist");
                 break;
            }
            
            System.out.println("Patient Normal? ");
            for (VitalSigns vs : patient.vitalsignsHistory) {
                patientStatus = vs.getPatientStatus();
            }
            System.out.println(patientStatus);
            
        }
        else if (userInput.equalsIgnoreCase("History")){
             System.out.println("Enter PatientID:");
            int ID = scan.nextInt();
            int number =0;
            for(int i=0;i < p.size() ;i++){
                if(p.get(i).getPatientid() == ID){
                 number = i;  
                 break;
                }else{
                    Patientnull = true;
                }     
            }
            if(Patientnull == false){
            patient = p.get(number);
            
            }else{
                System.out.println("PatientID does not Exist");
            }
            System.out.println("\nPatient Vital Signs: ");
            
            int a =0;
            System.out.println("Patient's name: " + patient.getPatientname());
            for (VitalSigns vs : patient.vitalsignsHistory) {
                a++;
                
                System.out.println("Patient's Type: "+vs.getAgeGroup());
                System.out.println("Patient's Respiratory Rate: "+vs.getRespiratoryRate());
                System.out.println("Patient's Heart Rate: "+vs.getHeartRate());
                System.out.println("Patients Blood Pressure: "+vs.getSysBP());
                System.out.println("Patient's Weight(in Kgs): "+vs.getWeightInKilos());
                System.out.println("Patients Weight(in Pounds): "+vs.getWeightInPounds()); 
                
            }
        }else if (userInput.equalsIgnoreCase("End")){
            System.out.println("\n Finished ");
            break;
        }
    }
    }
}
