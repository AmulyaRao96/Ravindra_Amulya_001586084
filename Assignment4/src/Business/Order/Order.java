/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author ramulyarao
 */
public class Order {
    private String orderID;
    private String restaurantName;
    private String customerName;
    private String deliveryMan;
     private ArrayList<Dishes> Order;
     private String priceofDish;
     private String statusofOrder;
     private String deliveryAddress;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public ArrayList<Dishes> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Dishes> Order) {
        this.Order = Order;
    }

    public String getPriceofDish() {
        return priceofDish;
    }

    public void setPriceofDish(String priceofDish) {
        this.priceofDish = priceofDish;
    }

    public String getStatusofOrder() {
        return statusofOrder;
    }

    public void setStatusofOrder(String statusofOrder) {
        this.statusofOrder = statusofOrder;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
     
     @Override
    public String toString() {
        return orderID;
    }
}
