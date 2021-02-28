/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;

/**
 *
 * @author ramulyarao
 */
public class Patient extends Person {

    private int patientId;
    private EncounterHistory encounterHistory = new EncounterHistory();
    
    public Patient( 
            String firstName, 
            String lastName, 
            LocalDate dateOfBirth, 
            String houseNumber, 
            String communityName, 
            String cityName,
            int patientId,
            int personId) {
            super(firstName, lastName, dateOfBirth, houseNumber, communityName, cityName, personId);
            this.patientId = patientId;
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    @Override
    public void printFriendlyString(){
        super.printFriendlyString();
        System.out.println("PatientId: " + this.patientId);
    }
}
