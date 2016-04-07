/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship.parts;

import com.fontys.softwarecraftsmanship.Part;
import com.fontys.softwarecraftsmanship.PartName;
import com.fontys.softwarecraftsmanship.Price;

/**
 *
 * @author E.Muit-Laptop
 */
public class ProcessorPart extends Part {
    
    double speed;
    public ProcessorPart(PartName title, Price price, double speed) {
        super(title, price);
        this.speed=speed;
    }
    
}
