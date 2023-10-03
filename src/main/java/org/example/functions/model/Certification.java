package org.example.functions.model;

public class Certification {
    private String id;
    private String name;
    private String completedOn;

    // Constructor
    public Certification(String id, String name, String completedOn) {
        this.id = id;
        this.name = name;
        this.completedOn = completedOn;
    }

    public Certification() {

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

    // Getter for completedOn
    public String getCompletedOn() {
        return completedOn;
    }

    // Setter for completedOn
    public void setCompletedOn(String completedOn) {
        this.completedOn = completedOn;
    }
}
