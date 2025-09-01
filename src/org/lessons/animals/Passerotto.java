package org.lessons.animals;

public class Passerotto extends Abstractanimals implements Volante {
    @Override
    public void verso() {
        System.out.println("Cip Cip");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
