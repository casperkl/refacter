package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final PartName title;
    private final Price price;
   
    public Part(PartName title, Price price) {
        this.title = title;
        this.price = price;
    }
    
    
    //Aanwezig voor unittests.
    public double GetPrice() {
        return price;
    }
    
    public void increasePrice(Computer c)
    {
        price.increasePrice(c);
    }
}
