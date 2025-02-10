package com.pawtograder.example.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EntrypointTestPart2 {
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
        assertEquals(13, entrypoint.getMessage().length());
    }
} 