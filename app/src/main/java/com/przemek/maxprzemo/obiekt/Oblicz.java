package com.przemek.maxprzemo.obiekt;

/**
 * Created by maxprzemo on 06.07.15.
 */
public class Oblicz {

    private int a;
    private int b;

    public Oblicz(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public String rozwiąż() {
        String rozwiązanie;
        int wynik;
        wynik = a * b;
        rozwiązanie = "Wynik wynosi " + wynik;
        return rozwiązanie;
    }
}