package com.fontys.softwarecraftsmanship;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author E.Muit-Laptop
 */
public class MemoryPart extends Part{
    
    String subtype;
    int size;
    public MemoryPart(PartName title, Price price, String subtype, int size) {
        super(title, price);
        this.subtype=subtype;
        this.size=size;
    }
    
}
