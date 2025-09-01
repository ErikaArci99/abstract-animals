package org.lessons.animals;

public class Main {

    // metodo che fa volare animali che implementano Volante
    public static void faiVolare(Volante animale) {
        animale.vola();
    }

    // metodo che fa nuotare animali che implementano Nuotante
    public static void faiNuotare(Nuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Abstractanimals passerotto = new Passerotto();
        Abstractanimals aquila = new Aquila();
        Abstractanimals delfino = new Delfino();
        Abstractanimals cane = new Cane();

        // test base
        cane.dormi();
        cane.verso();
        cane.mangia();

        // uso delle interfacce
        faiVolare((Volante) passerotto);
        faiVolare((Volante) aquila);
        faiNuotare((Nuotante) delfino);
    }
}