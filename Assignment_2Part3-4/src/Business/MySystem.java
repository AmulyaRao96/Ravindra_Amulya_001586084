/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ramulyarao
 */
public class MySystem {

    private List<Patient> patientDirectory = new ArrayList<>();
    private List<Person> personDirectory = new ArrayList<>();
    private List<City> citiesDirectory = new ArrayList<>();
    private List<Community> communitiesDirectory = new ArrayList<>();
    private List<House> housesDirectory = new ArrayList<>();

    public List<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public List<City> getCitiesDirectory() {
        return citiesDirectory;
    }

    public void addPerson(Person person) {
        this.personDirectory.add(person);
    }

    public void addPatient(Patient patient) {
        this.personDirectory.add(patient);
        this.patientDirectory.add(patient);
    }
    
    public House getOrAddHouse(House house) {
        Optional<House> existingHouse = this.housesDirectory
                .stream()
                .filter((h) -> {
                    return h.getCityName().equalsIgnoreCase(house.getCityName()) &&
                           h.getHouseNumber().equalsIgnoreCase(house.getHouseNumber()) &&
                           h.getCommunityName().equalsIgnoreCase(house.getCommunityName());
                })
                .findFirst();
        if (existingHouse.isPresent()) {
            return existingHouse.get();
        }
        else {
            Optional<City> existingCity = this.citiesDirectory
                .stream()
                .filter((h) -> h.getCityName().equalsIgnoreCase(house.getCityName()))
                .findFirst();
            if (!existingCity.isPresent()) {
                City city = new City(house.getCityName());
                this.citiesDirectory.add(city);
            }
            
            Optional<Community> existingCommunity = this.communitiesDirectory
                .stream()
                .filter((h) -> h.getCommunityName().equalsIgnoreCase(house.getCommunityName()))
                .findFirst();
            if (!existingCommunity.isPresent()) {
                Community community = new Community(house.getCommunityName(), house.getCityName());
                this.communitiesDirectory.add(community);
            }
            this.housesDirectory.add(house);
        }
        return house;
    }
    
    public Patient getPatientById(int patientId) {
        Optional<Patient> patient = this.patientDirectory
                .stream()
                .filter((h) -> h.getPatientId() == patientId)
                .findFirst();
        if (patient.isPresent()) {
            return patient.get();
        }
        else {
            return null;
        }
    }
    
    public static List<Patient> findAbnormalBPPatients(List<Patient> patients) {
        List<Patient> abnormalPatients = new ArrayList<Patient>();
        patients.forEach((Patient patient) -> {
            if (!VitalSignChecker.isBloodPressureNormal(patient)) {
                abnormalPatients.add(patient);
            }
        });
        return abnormalPatients;
    }
 
    public void showAbnoramlBPPatients(){
        List<Patient> abnormalPatients = findAbnormalBPPatients(this.patientDirectory);
        HashMap<String,String> communityPatientMap = new HashMap<String,String>();
        abnormalPatients.forEach((patient) -> {
            String community = patient.getResidence().getCommunityName();
            String countString = communityPatientMap.getOrDefault(community, "0");
            int count = Integer.parseInt(countString);
            communityPatientMap.put(community, String.valueOf(count+1));
        });
        communityPatientMap.forEach((key, value) -> {
            System.out.println("------------------------------------------------------");
            System.out.println(key + " : " + value);
            System.out.println("------------------------------------------------------");
        });
    }
}
