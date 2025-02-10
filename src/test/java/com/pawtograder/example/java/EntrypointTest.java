package com.pawtograder.example.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntrypointTest {
    @Test
    void testGetMessage() {
        Entrypoint entrypoint = new Entrypoint();
        assertEquals("Hello, World!", entrypoint.getMessage());
    }

    @Test
    void testGetMessageIsNotGoodbye() {
        Entrypoint entrypoint = new Entrypoint();
        assertNotEquals("Goodbye, World!", entrypoint.getMessage());
    }

    @Test 
    void testGetMessageContainsExclamation() {
        Entrypoint entrypoint = new Entrypoint();
        assertTrue(entrypoint.getMessage().contains("!"));
    }

    @Test
    void testGetMessageIsNotEmpty() {
        Entrypoint entrypoint = new Entrypoint();
        assertFalse(entrypoint.getMessage().isEmpty());
    }

    @Test
    void testGetMessageStartsWithHello() {
        Entrypoint entrypoint = new Entrypoint();
        assertTrue(entrypoint.getMessage().startsWith("Hello"));
    }

    @Test
    void testGetMessageHasCorrectLength() {
        Entrypoint entrypoint = new Entrypoint();
        assertEquals(11, entrypoint.getMessage().length());
    }

    @Test
    void testDoMath() {
        Entrypoint entrypoint = new Entrypoint();
        assertEquals(5, entrypoint.doMath(2, 3));
    }

    @Test
    void testDoMathWithZero() {
        Entrypoint entrypoint = new Entrypoint();
        assertEquals(1, entrypoint.doMath(1, 0));
    }

    @Test
    void testDoMathWithZero2() {
        Entrypoint entrypoint = new Entrypoint();
        assertEquals(1, entrypoint.doMath(0, 1));
    }

} 