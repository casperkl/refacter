package com.fontys.softwarecraftsmanship;

public class Main {

    public static void main(String[] args) {
        
        Computer c = new Computer();
        
        c.AddPart(new CasingPart(new PartName("Cooler Master Centurion 6"), 49.50, "Midi tower"));
        c.AddPart(new ProcessorPart(new PartName("Intel i7-4790"), 295.0, 3.6));
        c.AddPart(new MemoryPart(new PartName("G.SKILL Ripjaws X Series"), 99.99, "DDR3", 16));
        c.AddPart(new MotherboardPart(new PartName("MSI H97 PC MATE - Socket 1150 - ATX"), 89.0));
        
        if (c.IsComplete()) {
            System.out.println("Total price is EUR " + c.GetPrice());
        }
        if (!c.IsComplete()){
            System.out.println("Your computer is not ready yet...");
        }
    }
}
