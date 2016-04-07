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
public class CasingPart extends Part {
    
    String subtype;
    public CasingPart(String title, double price, String subtype) {
        super(title, price);
        this.subtype=subtype;
    }
    
}
