package com.boot.springbootweb;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author wanyu
 * @create 2022-03-24 11:09
 */
@DisplayName("junit5")
public class Junit5Test {

    @DisplayName("displayName")
    @Test
    void testDisplayName() {
        System.out.println(1);
    }

    @BeforeEach
    void testBeforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void testAfterEach() {
        System.out.println("AfterEach");
    }

    @Test
    @DisplayName("simple assertion")
    void simple() {
        assertEquals(3,1+2,"simple math");
        assertNotEquals(3, 1 + 1);

        assertNotSame(new Object(), new Object());
        Object obj = new Object();
        assertSame(obj, obj);

        assertFalse(1 > 2);
        assertTrue(1 < 2);
        assertNull(null);
        assertNotNull(new Object());
    }
}
