package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final PartName title;
    private final Price price;
   
    public Part(PartName title, Price price) {
        this.title = title;
        this.price = price;
    }
    
    
    public boolean EqualsPrice(double value)
    {
        return price.eqaulsPrice(value);
    }
    
    public void increasePrice(Computer computer)
    {
        price.increasePrice(computer);
    }
}
