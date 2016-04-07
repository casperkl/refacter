package com.fontys.softwarecraftsmanship;

import com.fontys.softwarecraftsmanship.parts.MotherboardPart;
import com.fontys.softwarecraftsmanship.parts.ProcessorPart;
import com.fontys.softwarecraftsmanship.parts.CasingPart;
import com.fontys.softwarecraftsmanship.parts.MemoryPart;
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
        
        parts.add(new CasingPart(new PartName(""), new Price(DEFAULT_PRICE), ""));
        parts.add(new ProcessorPart(new PartName(""), new Price(DEFAULT_PRICE), 0.0));
        parts.add(new MemoryPart(new PartName(""), new Price(DEFAULT_PRICE), "", 0));
        parts.add(new MotherboardPart(new PartName(""), new Price(DEFAULT_PRICE)));
        
        for (Part p : parts) {
            assertEquals(new Price(DEFAULT_PRICE), p.GetPrice());
        }
    }
}
