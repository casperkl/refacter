package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parts.MotherboardPart;
import com.fontys.softwarecraftsmanship.parts.ProcessorPart;
import com.fontys.softwarecraftsmanship.parts.MemoryPart;
import com.fontys.softwarecraftsmanship.parts.CasingPart;

public class Main {

    public static void main(String[] args) {
        
        Computer c = new Computer();
        
        c.AddPart(new CasingPart(new PartName("Cooler Master Centurion 6"), new Price(49.50), new Subtype("Midi tower")));
        c.AddPart(new ProcessorPart(new PartName("Intel i7-4790"), new Price(295.0), new Speed(3.6)));
        c.AddPart(new MemoryPart(new PartName("G.SKILL Ripjaws X Series"), new Price(99.99), new Subtype("DDR3"), new Size(16)));
        c.AddPart(new MotherboardPart(new PartName("MSI H97 PC MATE - Socket 1150 - ATX"), new Price(89.0)));
        
        if (c.IsComplete()) {
            System.out.println("Total price is EUR " + c.CalculatePrice());
        }
        if (!c.IsComplete()){
            System.out.println("Your computer is not ready yet...");
        }
    }
}
