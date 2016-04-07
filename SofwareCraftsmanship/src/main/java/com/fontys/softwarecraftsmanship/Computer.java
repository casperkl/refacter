package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {

    List<Part> parts = new ArrayList<>();

    public int NumberOfParts() {
        return parts.size();
    }

    public void AddPart(Part p) {
        parts.add(p);
    }

    public double GetPrice() {
        double price = 0.0;

        for (int i = 0; i < NumberOfParts(); i++) {
            Part part = parts.get(i);
            price += part.GetPrice();
        }

        return price;
    }

    public boolean IsComplete() {
        boolean hasCasing = false;
        boolean hasProcessor = false;
        boolean hasMemory = false;
        boolean hasMotherboard = false;

        for (Part part : parts) {
            if (part.GetType().equals("Casing")) {
                hasCasing = true;
            }
            if (part.GetType().equals("Processor")) {
                hasProcessor = true;
            }
            if (part.GetType().equals("Memory")) {
                hasMemory = true;
            }
            if (part.GetType().equals("Motherboard")) {
                hasMotherboard = true;
            }
        }

        if (!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard) {
            return false;
        } else {
            return true;
        }
    }
}
