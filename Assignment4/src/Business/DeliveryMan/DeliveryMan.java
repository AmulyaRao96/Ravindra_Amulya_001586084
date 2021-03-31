/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private String username;
    private ArrayList<Order> orderlist;
    private String address;
    private String number;
    
    public DeliveryMan(String UserName){
        this.username=username;
        orderlist = new ArrayList<Order>();
    }
    
     public void addingOrder(String restaurantname, String customername, String deliveryman, ArrayList<Dishes> Order, String cost, String deliveryaddress) {
        Order order=new Order();
        
        order.setCustomerName(customername);
        order.setRestaurantName(restaurantname);
        order.setDeliveryMan(deliveryman);
        order.setOrder(Order);
        order.setPriceofDish(cost);
        order.setDeliveryAddress(deliveryaddress);
        order.setStatusofOrder("New Order");
        orderlist.add(order);
        
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

    public ArrayList<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<Order> orderlist) {
        this.orderlist = orderlist;
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
      @Override
    public String toString() {
        return username;
    }
}
