package edu.craptocraft.mollap.administrador;

import edu.craptocraft.mollap.targets.Target;
import edu.craptocraft.mollap.filtres.*;

public class ProgramadorTasques {

    private Tasques tasques;

    public ProgramadorTasques(Target target) {
        tasques = new Tasques();
        tasques.setTarget(target);

    }

    public Tasques getTasques() {
        return this.tasques;
    }

    public void setTasca(Filtre tasca) {
        getTasques().afegirTasca(tasca);
    }

    public void executarTasques(String mensaje) {
        tasques.execucio(mensaje);
    }
}
