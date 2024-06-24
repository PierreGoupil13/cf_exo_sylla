package org.ss.orchestre.couplagefort;

public class Batterie implements Instrument {

    public void afficher() {
        System.out.println("Je suis un batteur...");
    }

    public void jouer() {
        System.out.println("Boom Boom Schack");
    }
}
