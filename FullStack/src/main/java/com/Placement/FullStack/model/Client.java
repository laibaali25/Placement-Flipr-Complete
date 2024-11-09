package com.Placement.FullStack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
public class Client {
    @Id
    private String id;
    private String imageUrl;
    private String name;
    private String description;
    private String designation;

    // No-argument constructor
    public Client() {
    }

    // Parameterized constructor
    public Client(String id, String imageUrl, String name, String description, String designation) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
        this.designation = designation;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
