package com.Placement.FullStack.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subscribers")
public class Subscriber {
    @Id
    private String id;
    private String email;

    // No-argument constructor
    public Subscriber() {
    }

    // Parameterized constructor
    public Subscriber(String id, String email) {
        this.id = id;
        this.email = email;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Optional: toString method for debugging
    @Override
    public String toString() {
        return "Subscriber{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
