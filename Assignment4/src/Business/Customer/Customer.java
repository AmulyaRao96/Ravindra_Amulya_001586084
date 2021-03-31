/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Customer  {
    
    private String name;
    private String username;
    private String number;
    private String address;
    private ArrayList<Order> orderlist;

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
    
    public Customer(String userName){
        this.username = username;
        orderlist=new ArrayList<Order>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
    }
    
    int id = 1;
    public void addingOrder(String restaurantName, String customername, String deliveryman, ArrayList<Dishes> Order, String priceofDish, String deliveryaddress) {
        Order order=new Order();
        order.setOrderID(String.valueOf(id));
        order.setCustomerName(customername);
        order.setRestaurantName(restaurantName);
        order.setDeliveryMan(deliveryman);
        order.setOrder(Order);
        order.setPriceofDish(priceofDish);
        order.setDeliveryAddress(deliveryaddress);
        order.setStatusofOrder("New Order");
        orderlist.add(order);
        id++;
    }
    
    
    
}
