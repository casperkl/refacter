package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final PartName title;
    private final double price;
   
    public Part(PartName title, double price) {
        this.title = title;
        this.price = price;
    }
    
    
    //Aanwezig voor unittests.
    public double GetPrice() {
        return price;
    }
    
    public void increasePrice(Computer c)
    {
        c.increasePrice(price);
    }
}
