/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author ramulyarao
 */
public class Encounter {
    public VitalSigns vitalSigns;

    public Encounter(VitalSigns vitals) {
        this.vitalSigns = vitals;
        this.timeStamp = new Date();
    }
    
    public Date timeStamp;
    
    public Date getTimeStamp() {
        return timeStamp;
    }
    
    public VitalSigns getVitalSigns() {
        return vitalSigns;
        
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
}
