package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parts.MotherboardPart;
import com.fontys.softwarecraftsmanship.parts.ProcessorPart;
import com.fontys.softwarecraftsmanship.parts.MemoryPart;
import com.fontys.softwarecraftsmanship.parts.CasingPart;

public class Computer {

    private Partlist parts = new Partlist();
    private Price price = new Price(0);

    public int NumberOfParts() {
        return parts.size();
    }

    public void AddPart(Part part) {
        if (part != null) {
            parts.add(part);
        }
    }

    public void increasePrice(double increase) {
        price.increasePriceBy(increase);
    }

    public Price CalculatePrice() {
        for (int i = 0; i < NumberOfParts(); i++) {
            Part part = parts.get(i);
            part.increasePrice(this);
        }
        return price;
    }

    public boolean IsComplete() {
        boolean[] completeness = {false,false,false,false};
        for (Part part : parts) {
            completeness[0] = isCasing(part, completeness[0]);
            completeness[1] = isProcessor(part, completeness[1]);
            completeness[2] = isMemory(part, completeness[2]);
            completeness[3] = isMotherboard(part, completeness[3]);
        }
        return !(!completeness[0] || !completeness[1] || !completeness[2] || !completeness[3]);

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
