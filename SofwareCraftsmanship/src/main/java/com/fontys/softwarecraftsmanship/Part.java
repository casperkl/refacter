package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final String title;
    private final double price;
    private String subtype = null;
    private int size = -1;
    private double speed = -1.0;
   
    
    // Motherboard
    public Part(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
    public double GetPrice() {
        return price;
    }
}
