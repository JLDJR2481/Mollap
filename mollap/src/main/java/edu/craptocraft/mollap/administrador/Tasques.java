package edu.craptocraft.mollap.administrador;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import edu.craptocraft.mollap.filtres.*;
import edu.craptocraft.mollap.targets.*;

public class Tasques {

    private List<Filtre> tasques = new ArrayList<>();

    private Optional<Target> target;

    public Tasques() {
    };

    public List<Filtre> getTasques() {
        return this.tasques;
    }

    public Optional<Target> getTarget() {
        return this.target;
    }

    public void setTarget(Target target) {
        this.target = Optional.ofNullable(target);
    }

    public void afegirTasca(Filtre filtre) {
        getTasques().add(filtre);
    }

    public void execucio(String mensaje) {
        getTasques().forEach(item -> item.execucio(mensaje));
        if (getTarget().isPresent()) {
            getTarget().get().execucio(mensaje);
        } else {

        }
    }

}
