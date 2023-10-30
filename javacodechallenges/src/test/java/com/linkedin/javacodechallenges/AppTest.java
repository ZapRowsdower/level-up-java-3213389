package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Get the person's first name
     */
    @Test
    public void testGetFirstName() {
        var person = new Person("Bill", "Steve", 40);
        assertEquals("Bill", person.getFirst_name());
    }

    @Test
    public void testGetLastName() {
        var person = new Person("Bill", "Steve", 40);
        assertEquals("Steve", person.getLast_name());
    }
}
