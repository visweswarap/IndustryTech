package com.industrytech.users.model;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestJunit {
    @Test

    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}
