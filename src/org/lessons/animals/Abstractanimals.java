package org.lessons.animals;

public abstract class Abstractanimals {

    // metodo comune a tutti gli animali
    public void dormi() {
        System.out.println("Zzz");
    }

    // metodi da implementare nelle sottoclassi
    public abstract void verso();

    public abstract void mangia();
}
