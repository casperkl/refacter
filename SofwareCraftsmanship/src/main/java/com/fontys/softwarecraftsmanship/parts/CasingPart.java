/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship.parts;

import com.fontys.softwarecraftsmanship.Part;
import com.fontys.softwarecraftsmanship.PartName;
import com.fontys.softwarecraftsmanship.Price;
import com.fontys.softwarecraftsmanship.Subtype;

/**
 *
 * @author E.Muit-Laptop
 */
public class CasingPart extends Part {
    
    private Subtype subtype;
    
    public CasingPart(PartName title, Price price, Subtype subtype) {
        super(title, price);
        this.subtype=subtype;
    }
    
}
