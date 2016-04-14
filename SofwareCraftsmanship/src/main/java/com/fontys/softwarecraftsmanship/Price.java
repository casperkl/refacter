/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

/**
 *
 * @author Casper_
 */
public class Price {
    
    private double value;

    public Price(double value)
    {
        this.value=value;
    }

    void increasePrice(Computer computer) 
    {
        computer.increasePrice(value);
    }   
           public boolean eqaulsPrice(double value)
        {
            return this.value==value;
        }

    void increasePriceBy(double increase) {
        value+=increase;
    }
}
