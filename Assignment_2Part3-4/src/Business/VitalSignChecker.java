/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ramulyarao
 */
public class VitalSignChecker {

    public static boolean isBloodPressureNormal(Patient patient) {
        AgeGroup ageGroup = patient.getAgeGroup();
        EncounterHistory history = patient.getEncounterHistory();
        Encounter encounter = history.latestEncounter;
        VitalSigns vitalSigns = encounter.getVitalSigns();
        int bp = vitalSigns.getSysBP();
        switch (ageGroup) {
            case Newborn:
                return bp > 49 && bp < 71;
            case Infant:
                return bp > 69 && bp < 101;
            case Toddler:
            case PreSchooler:
                return bp > 79 && bp < 111;
            case SchoolAge:
                return bp > 79 && bp < 121;
            case Adolscent:
                return bp > 109 && bp < 121;
        }
        // Throw exception invalid value
        return true;
    }

}
