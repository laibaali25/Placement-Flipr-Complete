package com.Placement.FullStack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "projects")
public class Project {
    @Id
    private String id;
    private String imageUrl;
    private String name;
    private String description;

    // No-argument constructor
    public Project() {
    }

    // Parameterized constructor
    public Project(String id, String imageUrl, String name, String description) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
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

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
