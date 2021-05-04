package com.company;

public class Game {
    int id;
    String name;
    double price;
    String details;

    public Game() {

    }

    public Game(int id, String name, double price, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
