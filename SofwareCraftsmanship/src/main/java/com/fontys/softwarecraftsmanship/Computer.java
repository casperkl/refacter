package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parts.MotherboardPart;
import com.fontys.softwarecraftsmanship.parts.ProcessorPart;
import com.fontys.softwarecraftsmanship.parts.MemoryPart;
import com.fontys.softwarecraftsmanship.parts.CasingPart;

public class Computer {

    Partlist parts = new Partlist();
    double price = 0;

    public int NumberOfParts() {
        return parts.size();
    }

    public void AddPart(Part p) {
        if (p != null) {
            parts.add(p);
        }
    }

    public void increasePrice(double increase) {
        price += increase;
    }

    public double GetPrice() {
        for (int i = 0; i < NumberOfParts(); i++) {
            Part part = parts.get(i);
            part.increasePrice(this);
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

        return !(!hasCasing || !hasProcessor || !hasMemory || !hasMotherboard);

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
