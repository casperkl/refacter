/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

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
