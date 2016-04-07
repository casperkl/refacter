package com.fontys.softwarecraftsmanship.parts;

import com.fontys.softwarecraftsmanship.Part;
import com.fontys.softwarecraftsmanship.PartName;
import com.fontys.softwarecraftsmanship.Price;
import com.fontys.softwarecraftsmanship.Subtype;

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
    
    Subtype subtype;
    int size;
    public MemoryPart(PartName title, Price price, Subtype subtype, int size) {
        super(title, price);
        this.subtype=subtype;
        this.size=size;
    }
    
}
