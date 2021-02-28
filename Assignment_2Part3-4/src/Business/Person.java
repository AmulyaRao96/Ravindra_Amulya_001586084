/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author ramulyarao
 */
public class Person {
    
    private int personId;
    private AgeGroup ageGroup;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private House residence;
        
    public Person(
            String firstName, 
            String lastName, 
            LocalDate dateOfBirth, 
            String houseNumber, 
            String communityName, 
            String cityName,
            int personId
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.personId = personId;
        this.residence = new House(houseNumber, communityName, cityName);
        this.setAgeGroup();
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }
        
    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    private void setAgeGroup() {
        Period period = Period.between(LocalDate.now(), this.dateOfBirth);
        //System.out.println(period.getMonths() +  " " +  period.getMonths());    
        int ageInMonths = Math.abs((period.getYears()*12) + Math.abs(period.getMonths()));
        int ageInYears = ageInMonths / 12;
        if (ageInMonths < 1) {
            this.ageGroup = AgeGroup.Newborn;
        } else if (ageInMonths >= 1 && ageInMonths <= 12) {
            this.ageGroup = AgeGroup.Infant;

        } else if (ageInYears >= 1 && ageInYears <= 3) {
            this.ageGroup = AgeGroup.Toddler;

        } else if (ageInYears >= 3 && ageInYears <= 5) {
            this.ageGroup = AgeGroup.PreSchooler;

        } else if (ageInYears >= 6 && ageInYears <= 12) {
            this.ageGroup = AgeGroup.SchoolAge;

        } else {
            this.ageGroup = AgeGroup.Adolscent;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House houseNumber) {
        this.residence = houseNumber;
    }
    
    public void printFriendlyString(){
        System.out.println("----------------------------------------------------");
        System.out.println("Person details..........");
        System.out.println("----------------------------------------------------");
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Id: " + this.personId);
        System.out.println("Date Of Birth: " + this.dateOfBirth.toString());
        System.out.println("Age group: " + this.ageGroup.toString());
        System.out.println("House details...........");
        this.residence.printFriendlyString();
    }
}
