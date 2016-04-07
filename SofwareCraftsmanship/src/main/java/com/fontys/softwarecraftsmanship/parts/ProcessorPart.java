/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship.parts;

import com.fontys.softwarecraftsmanship.Part;
import com.fontys.softwarecraftsmanship.PartName;
import com.fontys.softwarecraftsmanship.Price;
import com.fontys.softwarecraftsmanship.Speed;

/**
 *
 * @author E.Muit-Laptop
 */
public class ProcessorPart extends Part {
    
    Speed speed;
    public ProcessorPart(PartName title, Price price, Speed speed) {
        super(title, price);
        this.speed=speed;
    }
    
}
