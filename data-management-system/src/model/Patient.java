/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Kunal
 */
public class Patient {
    private String patientid;
    private String primarydoc;
    private String lastvisit;
    private String nxtapt;
    private String allergies;
    private String onmedication;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPrimarydoc() {
        return primarydoc;
    }

    public void setPrimarydoc(String primarydoc) {
        this.primarydoc = primarydoc;
    }

    public String getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(String lastvisit) {
        this.lastvisit = lastvisit;
    }

    public String getNxtapt() {
        return nxtapt;
    }

    public void setNxtapt(String nxtapt) {
        this.nxtapt = nxtapt;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getOnmedication() {
        return onmedication;
    }

    public void setOnmedication(String onmedication) {
        this.onmedication = onmedication;
    }
    
    
    
}
