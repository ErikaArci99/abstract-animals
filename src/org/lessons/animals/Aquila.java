package org.lessons.animals;

public class Aquila extends Abstractanimals implements Volante {
    @Override
    public void verso() {
        System.out.println("Fiii Fiii");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
