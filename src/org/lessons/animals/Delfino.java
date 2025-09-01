package org.lessons.animals;

public class Delfino extends Abstractanimals implements Nuotante {
    @Override
    public void verso() {
        System.out.println("Click Click");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
