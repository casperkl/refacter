package com.fontys.softwarecraftsmanship;

import java.util.*;

public class Computer {

    List<Part> parts = new ArrayList<>();

    public int NumberOfParts() {
        return parts.size();
    }

    public void AddPart(Part p) {
        if (p!=null)
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
            hasCasing = isCasing(part, hasCasing);
            hasProcessor = isProcessor(part, hasProcessor);
            hasMemory = isMemory(part, hasMemory);
            hasMotherboard = isMotherboard(part, hasMotherboard);
        }

        if (!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard) {
            return false;
        } 
            return true;
        
    }

    boolean isCasing(Part part, boolean currentValue) {
        if (part instanceof CasingPart) {
            return true;
        }

        return currentValue;
    }

    boolean isMemory(Part part, boolean currentValue) {
        if (part instanceof MemoryPart) {
            return true;
        }

        return currentValue;
    }

    boolean isProcessor(Part part, boolean currentValue) {
        if (part instanceof ProcessorPart) {
            return true;
        }

        return currentValue;
    }

    boolean isMotherboard(Part part, boolean currentValue) {
        if (part instanceof MotherboardPart) {
            return true;
        }

        return currentValue;
    }
}
