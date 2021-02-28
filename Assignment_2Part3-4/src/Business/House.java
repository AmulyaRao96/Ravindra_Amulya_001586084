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
public class House extends Community {

    private String houseNumber;
    
    public House(String houseNumber, String community, String city){
        super(community, city);
        this.houseNumber = houseNumber;
    }
    
    public String getHouseNumber() {
        return houseNumber;
    }
    
    @Override
     public void printFriendlyString() {
        super.printFriendlyString();
        System.out.println("House Number: " + this.houseNumber);
    }
    
}
