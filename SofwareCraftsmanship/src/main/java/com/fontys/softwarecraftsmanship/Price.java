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
    
    double value;
    


    public Price(double value)
    {
        this.value=value;
    }

    void increasePrice(Computer c) 
    {
        c.increasePrice(value);
    }   
           public boolean eqaulsPrice(double v)
        {
            return value==v;
        }
}
