package edu.craptocraft.mollap.filtres;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutenticacioTest {

    @Test
    public void execucioTest() {

        String name = "José Luis";

        assertNotNull(name);

        assertEquals("José Luis", name.toString());

        String expected = "Autenticación OK para José Luis";

        String prueba = ("Autenticación OK para " + name.toString());

        assertEquals(expected, prueba);

        String nameTwo = "David";

        assertNotNull(nameTwo);

        assertEquals("David", nameTwo.toString());

        String pruebaTwo = ("Autenticación OK para " + nameTwo.toString());

        String expectedTwo = "Autenticación OK para David";

        assertEquals(expectedTwo, pruebaTwo);

    }

}
