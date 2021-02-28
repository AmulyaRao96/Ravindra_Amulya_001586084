/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author ramulyarao
 */
public class EncounterHistory {
    public Stack<Encounter> history = new Stack<Encounter>();
    public Encounter latestEncounter;
    
    public void recordEncounter(Encounter encounter){
        this.latestEncounter = encounter;
        this.history.push(encounter);
    }
}

