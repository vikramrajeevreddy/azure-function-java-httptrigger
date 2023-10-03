package org.example.functions.model;

import java.util.List;

public class ResponseData {
    private String id;
    private String name;
    private boolean isActive;
    private String locations;
    private List<Certification> certifications;

    // Constructor
    public ResponseData(){
    }
    public ResponseData(String id, String name, boolean isActive, String locations, List<Certification> certifications) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.locations = locations;
        this.certifications = certifications;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for isActive
    public boolean isActive() {
        return isActive;
    }

    // Setter for isActive
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Getter for locations
    public String getLocations() {
        return locations;
    }

    // Setter for locations
    public void setLocations(String locations) {
        this.locations = locations;
    }

    // Getter for certifications
    public List<Certification> getCertifications() {
        return certifications;
    }

    // Setter for certifications
    public void setCertifications(List<Certification> certifications) {
        this.certifications = certifications;
    }
}
