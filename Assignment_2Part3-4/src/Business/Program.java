/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ramulyarao
 */
public class Program {
    
    static Scanner sc = new Scanner(System.in);
    static MySystem system = new MySystem();
    private static List<String> cityNames = Arrays.asList("Boston", "Seattle", "NewYork");
    private static  List<String> communityNames = Arrays.asList("King County", "Hudson Bay", "Rockefeller Ridge");
    private static List<String> firstNames = Arrays.asList("Bob", "Bruce", "Flash", "Peter");
    private static List<String> lastNames = Arrays.asList("Parker", "Wayne", "Catalyst", "Cavill");
    private static List<LocalDate> dateOfBirths = Arrays.asList(
            LocalDate.parse("1985-12-31"), 
            LocalDate.parse("1999-11-01"),
            LocalDate.parse("2021-01-01"),
            LocalDate.parse("2021-02-24")
    );
    private static List<Integer> bps = Arrays.asList(111,90,49,51,65,71);
        
    public static void startConsole(){
        System.out.println("----------------------------------------------------");
        System.out.println("1: Show total patients with abnormal BP by community");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("2: Add doctor visit");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("3: Add new Patient");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("4: List All patients");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("5: Exit");
        System.out.println("----------------------------------------------------");
        System.out.println();
        String optionString = sc.nextLine();
        int option = Integer.parseInt(optionString);
        switch(option) {
            case 1:
                system.showAbnoramlBPPatients();
                break;
            case 2:
                addDoctorVisit();
                break;
            case 3:
                addNewPatient();
            case 4:
                listAllPatients();
            case 5:
                System.out.println("Exiting.....Bye");
                break;
            default:
                startConsole();
        }
    }
    
    public static Patient addNewPatient(){
        System.out.println("----------------------------------------------------");
        System.out.println("Create a new patient workflow initializing..........");
        System.out.println("----------------------------------------------------");
        System.out.println("Enter patient first name");
        String firstName = sc.nextLine();
        System.out.println("Enter patient last name");
        String lastName = sc.nextLine();
        boolean validDob = false;
        LocalDate dateOfBirth = null;
        while(!validDob) {
            try {
                System.out.println("Enter patient's date of birth");
                String dateOfBirthString = sc.nextLine();
                dateOfBirth = LocalDate.parse(dateOfBirthString);
                validDob = true;
            }
            catch (Exception ex) {
                System.out.println("Please enter a valid date of birth....");
            }
        }
        System.out.println("Enter patient's house number");
        String houseNumber = sc.nextLine();
        System.out.println("Enter patient's community");
        String communityName = sc.nextLine();
        System.out.println("Enter patient's city");
        String cityName = sc.nextLine();
        Patient patient = new Patient(
                firstName, 
                lastName, 
                dateOfBirth, 
                houseNumber, 
                communityName,
                cityName,  
                system.getPatientDirectory().size(),
                system.getPersonDirectory().size()
        );
        system.addPatient(patient);
        patient.printFriendlyString();
        System.out.println("Success adding patient.......");
        return patient;
    }
    
    public static void listAllPatients() {
        System.out.println("-------LISTING ALL PATIENTS--------");
        system.getPatientDirectory().forEach(patient -> {
            patient.printFriendlyString();
           System.out.println("------------------------------------------");
        });
    }
        
    public static void addDoctorVisit() {
        Patient patient = null;
        System.out.println("Initialzing Doctor visit workflow.............");
        System.out.println("Choose one from below.....");
        System.out.println("1: New Patient");
        System.out.println("2: Existing Patient");
        String optionString = sc.nextLine();
        switch(optionString) {
            case "1":
                patient  = addNewPatient();
                break;
            case "2":
                patient = fetchExistingPatient();
                break;
            default:
                addDoctorVisit();
        }
        if (patient == null) {
            addDoctorVisit();
        }
        else {
            Encounter encounter = addEncounterDetails();
            patient.getEncounterHistory().recordEncounter(encounter);
            System.out.println("Successfully added doctor visit.");
        }
    }
    
    public static Patient fetchExistingPatient() {
        System.out.println("Enter patientId");
        String optionString = sc.nextLine();
        int patientId = Integer.parseInt(optionString);
        Patient patient = fetchExistingPatientById(patientId);
        return patient;
    }
    
    public static Encounter addEncounterDetails() {
        Encounter encounter = null;
        VitalSigns vitals = new VitalSigns();
        System.out.println("Enter blood pressure...");
        // add error handling here 
        vitals.setSysBP(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter respiratory rate...");
        // add error handling here 
        vitals.setRespiratoryRate(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter heart rate...");
        // add error handling here 
        vitals.setHeartRate(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter weight(kg)..");
        // add error handling here 
        vitals.setWeightInKilos(Float.parseFloat(sc.nextLine()));
        encounter = new Encounter(vitals);
        return encounter;
    }
    
    private static Patient fetchExistingPatientById(int patientId) {
        Patient patient = system.getPatientById(patientId);
        if (patient == null) {
            System.out.println("Cannot find patient with id:" + patientId + " .............");

        }
        else {
            System.out.println("Found patient with id:" + patientId + " .............");
            patient.printFriendlyString();
        }
        return patient;
    }
        
   
    public static void setupData(int numberOfData){
        for (int i=0;i < numberOfData; i++) {
               Patient patient = new Patient(
                       firstNames.get(new Random().nextInt(firstNames.size())),
                       lastNames.get(new Random().nextInt(lastNames.size())),
                       dateOfBirths.get(new Random().nextInt(dateOfBirths.size())),
                       String.valueOf(new Random().nextInt(1000)),
                       communityNames.get(new Random().nextInt(communityNames.size())),
                       cityNames.get(new Random().nextInt(cityNames.size())),
                       system.getPatientDirectory().size(),
                       system.getPersonDirectory().size()
               );
               
               VitalSigns vitalSigns = new VitalSigns();
               vitalSigns.setSysBP(bps.get(new Random().nextInt(bps.size())));
               Encounter encounter = new Encounter(vitalSigns);
               patient.getEncounterHistory().recordEncounter(encounter);
               system.getPatientDirectory().add(patient);
               system.getPersonDirectory().add(patient);
        }    
    }
}
