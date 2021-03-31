/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private String username;
    private String address;
    private String number;
    private ArrayList<Dishes> Menu;
    private ArrayList<Order> orderlist;
    
    public Restaurant(String userName){
        this.username = userName;
        Menu = new ArrayList<Dishes>();
        orderlist=new ArrayList<Order>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Dishes> getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList<Dishes> Menu) {
        this.Menu = Menu;
    }

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderList) {
        this.orderlist = orderList;
    }
     public void addFoodItem(Dishes menu){
        Menu.add(menu);
    }
    
    public void removeFoodItem(Dishes menu){
         Menu.remove(menu);
    }
    int id = 1;
      public void addingOrder(String restaurentName, String customerName, String deliveryman, ArrayList<Dishes> Order, String priceofDish, String deliveryAddress) {
        Order order=new Order();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customerName);
        order.setRestaurantName(restaurentName);
        order.setDeliveryMan(deliveryman);
        order.setOrder(Order);
        order.setPriceofDish(priceofDish);
        order.setDeliveryAddress(deliveryAddress);
        order.setStatusofOrder("New Order");
        orderlist.add(order);
        id++;
    }
}
