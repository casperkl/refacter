package com.fontys.softwarecraftsmanship;

import static org.junit.Assert.*;
import java.util.*;

public class PartTest {
    
    /**
     * Test of GetPrice method.
     */
    @org.junit.Test
    public void testGetPrice() {
        final double DEFAULT_PRICE = 10.0;
        List<Part> parts = new ArrayList<>();
        
        parts.add(new CasingPart(new PartName(""), DEFAULT_PRICE, ""));
        parts.add(new ProcessorPart(new PartName(""), DEFAULT_PRICE, 0.0));
        parts.add(new MemoryPart(new PartName(""), DEFAULT_PRICE, "", 0));
        parts.add(new MotherboardPart(new PartName(""), DEFAULT_PRICE));
        
        for (Part p : parts) {
            assertEquals(DEFAULT_PRICE, p.GetPrice(), 0.0);
        }
    }
}
