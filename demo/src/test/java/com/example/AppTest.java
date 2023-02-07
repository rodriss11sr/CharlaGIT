package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * Test for App.simpleFunction
     */
    @Test
    public void testSimpleFunction() {
        assertEquals(4, App.simpleFunction(2));
    }
}
