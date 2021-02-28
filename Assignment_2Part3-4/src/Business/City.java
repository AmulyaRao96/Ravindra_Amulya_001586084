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
public class City {
    
    String cityName;

    public City(String name){
        this.cityName = name;
    }
    
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    public void printFriendlyString() {
        System.out.println("City: " + this.cityName);
    }
}
