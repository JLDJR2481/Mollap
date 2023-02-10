package edu.craptocraft.mollap.targets;

public class Vehicle implements Target {

    public Vehicle() {
    };

    @Override
    public void execucio(String id) {
        System.out.println("Puerta abierta " + id.toString() + "!");
    }

}
