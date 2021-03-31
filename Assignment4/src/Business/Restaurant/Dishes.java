/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author ramulyarao
 */
public class Dishes {
    
    private String name;
    private String description;
    private String priceofDish;
    
    public Dishes(String name,String description,String priceofdish){
        this.name = name;
        this.description = description;
        this.priceofDish = priceofdish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceofDish() {
        return priceofDish;
    }

    public void setPriceofDish(String priceofDish) {
        this.priceofDish = priceofDish;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
