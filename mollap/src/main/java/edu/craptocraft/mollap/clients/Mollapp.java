package edu.craptocraft.mollap.clients;

import edu.craptocraft.mollap.administrador.ProgramadorTasques;

public class Mollapp implements Client {

    private ProgramadorTasques programador;

    public Mollapp() {
    };

    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;
    }

    @Override
    public void enviarPeticio(String id) {
        programador.executarTasques(id);
    }

}
