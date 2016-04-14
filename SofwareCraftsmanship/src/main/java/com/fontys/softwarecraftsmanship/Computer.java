package com.fontys.softwarecraftsmanship;
import com.fontys.softwarecraftsmanship.parts.*;

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
        boolean[] completeness = {false, false, false, false};
        for (Part part : parts) {
            completeness[0] = isTypeOfPart(part, completeness[0], CasingPart.class);
            completeness[1] = isTypeOfPart(part, completeness[1], ProcessorPart.class);
            completeness[2] = isTypeOfPart(part, completeness[2], MemoryPart.class);
            completeness[3] = isTypeOfPart(part, completeness[3], MotherboardPart.class);
        }
        return !(!completeness[0] || !completeness[1] || !completeness[2] || !completeness[3]);
    }

    boolean isTypeOfPart(Part part, boolean currentValue, Class clazz) {
        if (clazz.isInstance(part)) {
            return true;
        }
        return currentValue;
    }
}
