/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
   private ArrayList<Restaurant> restaurantdirectory;
   private Restaurant restaurant;
   private Dishes menu;
   
   public RestaurantDirectory(){
        restaurantdirectory = new ArrayList<Restaurant>();
    }

    public ArrayList<Restaurant> getRestaurantdirectory() {
        return restaurantdirectory;
    }

    public void setRestaurantdirectory(ArrayList<Restaurant> restaurantdirectory) {
        this.restaurantdirectory = restaurantdirectory;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Dishes getMenu() {
        return menu;
    }

    public void setMenu(Dishes menu) {
        this.menu = menu;
    }
   
   public Restaurant createUserAccount(String username){
        restaurant = new Restaurant(username);
        restaurantdirectory.add(restaurant);
        return restaurant;
    }
     
     public void updateRestaurantInfo(Restaurant restraunt, String name,String number,String address ){
         restraunt.setName(name);
         restraunt.setAddress(address);
         restraunt.setNumber(number);
     }
     
    
    
    public void deleteRestaurant(String username){
        for(int i=0;i<restaurantdirectory.size();i++){
            if(restaurantdirectory.get(i).getUsername()==username){
                restaurantdirectory.remove(i);
            }
        }
    
    }
    
    public Dishes AddMenuDishes(Restaurant restro,String name,String desc,String amount){
        menu=new Dishes(name, desc, amount);
        restro.addFoodItem(menu);
        return menu;
    }
    
    public void DeleteDishes(Restaurant restro,Dishes menu){
        restro.removeFoodItem(menu);
        
    }

    
}
