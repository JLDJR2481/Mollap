package edu.craptocraft.mollap.filtres;

import org.junit.Test;

import static org.junit.Assert.*;

public class AutoritzacioTest {

    @Test
    public void execucioTest() {

        String name = "José Luis";

        assertNotNull(name);

        assertEquals("José Luis", name.toString());

        String expected = "Autorización OK para José Luis";

        String prueba = ("Autorización OK para " + name.toString());

        assertEquals(expected, prueba);

        String nameTwo = "David";

        assertNotNull(nameTwo);

        assertEquals("David", nameTwo.toString());

        String pruebaTwo = ("Autorización OK para " + nameTwo.toString());

        String expectedTwo = "Autorización OK para David";

        assertEquals(expectedTwo, pruebaTwo);

    }

}
