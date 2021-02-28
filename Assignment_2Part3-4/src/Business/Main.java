/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ramulyarao
 */
public class Main {
 
    public static void main(String[] args) {
        Program.setupData(10);
        while (true) {
            Program.startConsole();
        }
    }
    

          
    
    
//    public static void setupSystem() {
//        Patient george = new Patient();
//        george.setFirstName("George");
//        george.setLastName("Jetson");
//        House house = new House();
//        house.setCommunity("Hudson Bay");
//        george.setResidence(house);
//        george.setAgeInMonths(56);
//        VitalSigns vitals = new VitalSigns();
//        vitals.setSysBP(500);
//        Encounter encounter = new Encounter();     
//        encounter.setVitalSigns(vitals);
//        george.getEncounterHistory().recordEncounter(encounter);
//        
//        Patient patient2 = new Patient();
//        patient2.setFirstName("Doe");
//        patient2.setLastName("Jetson");
//        patient2.setAgeInMonths(420);
//        House house2 = new House();
//        house2.setCommunity("College Station");
//        patient2.setResidence(house2);
//        VitalSigns vitals2 = new VitalSigns();
//        vitals2.setSysBP(80);
//        Encounter encounter2 = new Encounter();     
//        encounter2.setVitalSigns(vitals2);  
//        patient2.getEncounterHistory().recordEncounter(encounter2);
//        
//        Patient patient3 = new Patient();
//        patient3.setFirstName("Henry");
//        patient3.setLastName("Cavill");
//        patient3.setAgeInMonths(600);
//        House house3 = new House();
//        house3.setCommunity("Boston Bridge");
//        patient3.setResidence(house3);
//        VitalSigns vitals3 = new VitalSigns();
//        vitals3.setSysBP(125);
//        Encounter encounter3 = new Encounter();     
//        encounter3.setVitalSigns(vitals3);  
//        patient3.getEncounterHistory().recordEncounter(encounter3);
//        
//        patientDirectory.addPatient(patient2);
//        patientDirectory.addPatient(george);
//        patientDirectory.addPatient(patient3);
//    }
//    
}
