package org.lessons.animals;

public class Main {
    public static void main(String[] args) {
        Abstractanimals cane = new Cane();
        Abstractanimals passerotto = new Passerotto();
        Abstractanimals aquila = new Aquila();
        Abstractanimals delfino = new Delfino();

        // test metodi
        cane.dormi();
        cane.verso();
        cane.mangia();

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();
    }
}