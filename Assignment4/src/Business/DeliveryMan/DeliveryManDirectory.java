/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan>DeliveryManDirectory;
    private DeliveryMan deliveryman;
    
    public DeliveryManDirectory(){
        this.DeliveryManDirectory =  new ArrayList<DeliveryMan>();
    }
     public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return DeliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.DeliveryManDirectory = deliveryManDirectory;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryman;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryman = deliveryMan;
    }
    
    public DeliveryMan createUserAccount(String username){
        deliveryman = new DeliveryMan(username);
        DeliveryManDirectory.add(deliveryman);
        return deliveryman;
    }
    
    
    public void deleteDeliveryMan(String username){
        for(int i=0;i<DeliveryManDirectory.size();i++){
            if(DeliveryManDirectory.get(i).getUsername()==username){
                DeliveryManDirectory.remove(i);
            }
        }
    
    }
    
}


