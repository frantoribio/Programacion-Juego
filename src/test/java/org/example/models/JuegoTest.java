package org.example.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JuegoTest {

    Juego j = new Juego();

    @BeforeEach
    public void resetJuego() {
        j = new Juego("a", 1.0f, Platform.PC);
    }

    @Test
    public void testGetTitle() {

        assertEquals("a", j.getTitle());

    }

    @Test
    public void testSetTitle() {

        Assertions.assertAll(
            () -> assertDoesNotThrow(() -> j.setTitle("mario bros")),
            () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setTitle(""))
        );

    }

    @Test
    public void testGetPrice() {

        assertEquals(1.0f, j.getPrice());

    }

    @Test
    public void testSetPrice() {

        Assertions.assertAll(
                () -> assertDoesNotThrow(() -> j.setPrice(8f)),
                () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setPrice(-70f)),
                () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setPrice(400f))
        );
    }

    @Test
    public void testGetPlatform() {

        assertEquals(Platform.PC, j.getPlatform());

    }

    @Test
    public void testSetPlatform() {

        Assertions.assertAll(
                () -> assertDoesNotThrow(() -> j.setPlatform("xbox")),
                () -> assertDoesNotThrow(() -> j.setPlatform(Platform.PLAY)),
                () -> assertDoesNotThrow(() -> j.setPlatform("    XBox  ")),
                () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setPlatform("gameboy"))
        );
    }

}