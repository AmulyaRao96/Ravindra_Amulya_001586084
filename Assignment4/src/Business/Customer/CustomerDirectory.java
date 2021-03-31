/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer>CustomerDirectory;
    private Customer customer;
    
    public CustomerDirectory(){
        this.CustomerDirectory = new ArrayList<Customer>();
    }
     public ArrayList<Customer> getCustomerDirectory() {
        return CustomerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.CustomerDirectory = customerDirectory;
    }
    public Customer createUserAccount(String username){
        customer = new Customer(username);
        CustomerDirectory.add(customer);
        return customer;
    }
    public void deletecustomer(String username){
        for(int i=0;i<CustomerDirectory.size();i++){
            if(CustomerDirectory.get(i).getUsername()==username){
                CustomerDirectory.remove(i);
            }
        }
    }
    
}
