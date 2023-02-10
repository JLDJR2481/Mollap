package edu.craptocraft.targets;

import static org.junit.Assert.*;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void abrirPuertaTest() {

        String name = "Abel";

        assertNotNull(name);
        String esperado = "Puerta abierta Abel!";
        String prueba = ("Puerta abierta " + name.toString() + "!");

        assertEquals(esperado, prueba);

    }

}
