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

        String correctValue = "Mario Bros";
        String emptyValue = "";
        Assertions.assertAll(
            () -> assertDoesNotThrow(() -> j.setTitle(correctValue)),
            () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setTitle(emptyValue))
        );

    }

    @Test
    public void testGetPrice() {

        assertEquals(1.0f, j.getPrice());

    }

    @Test
    public void testSetPrice() {

        float correctValue = 8f;
        float belowLimitValue = -70f;
        float overLimitValue = 400f;
        Assertions.assertAll(
                () -> assertDoesNotThrow(() -> j.setPrice(correctValue)),
                () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setPrice(belowLimitValue)),
                () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setPrice(overLimitValue))
        );
    }

    @Test
    public void testGetPlatform() {

        assertEquals(Platform.PC, j.getPlatform());

    }

    @Test
    public void testSetPlatform() {

        String correctValue = "xbox";
        Platform correctPlatform = Platform.PLAYSTATION;
        String stringCorrectedValue = "    xbox    ";
        String wrongValue = "gameboy";
        Assertions.assertAll(
                () -> assertDoesNotThrow(() -> j.setPlatform(correctValue)),
                () -> assertDoesNotThrow(() -> j.setPlatform(correctPlatform)),
                () -> assertDoesNotThrow(() -> j.setPlatform(stringCorrectedValue)),
                () -> assertThrowsExactly(IllegalArgumentException.class, () -> j.setPlatform(wrongValue))
        );
    }

}