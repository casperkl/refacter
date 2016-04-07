package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final PartName title;
    private final Price price;
   
    public Part(PartName title, Price price) {
        this.title = title;
        this.price = price;
    }
    
    
    public boolean EqualsPrice(double val)
    {
        return price.eqaulsPrice(val);
    }
    
    public void increasePrice(Computer c)
    {
        price.increasePrice(c);
    }
}
