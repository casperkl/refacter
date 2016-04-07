package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final String title;
    private final double price;
    private String subtype = null;
    private int size = -1;
    private double speed = -1.0;
    
    public Part(String title, double price, String subtype, int size, double speed) {
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
        this.speed = speed;
    }
    
    // Memory
    public Part(String title, double price, String subtype, int size) {
        this.title = title;
        this.price = price;
        this.subtype = subtype;
        this.size = size;
    }
    
    // Casing
    public Part(String title, double price, String subtype) {
        this.title = title;
        this.price = price;
        this.subtype = subtype;
    }
    
    // Processor
    public Part(String title, double price, double speed) {
        this.title = title;
        this.price = price;
        this.speed = speed;
    }
    
    // Motherboard
    public Part(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
    public double GetPrice() {
        return price;
    }
}
