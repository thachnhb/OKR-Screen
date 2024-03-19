package org.sakaiproject.tool.helloworld.model;

import java.util.List;

public class Employee {

    private String id;
    private String name;
    private String address;
    private String email;
    private String gender;
    private List<String> favorites;
    private String position;

    // Constructors, getters, and setters

    public Employee() {
    }

    public Employee(String id, String name, String address, String email, String gender, List<String> favorites, String position) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.favorites = favorites;
        this.position = position;
    }

    // Getters and setters...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

