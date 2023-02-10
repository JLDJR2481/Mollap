package edu.craptocraft.mollap.clients;

import edu.craptocraft.mollap.administrador.ProgramadorTasques;

public interface Client {
    void setProgramadorTasques(ProgramadorTasques programador);

    void enviarPeticio(String peticion);

}
