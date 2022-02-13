package com.example.ukesoppgaverspringbasic;

import java.util.ArrayList;

//oppgave 2
public class Valuta {
    private String navn;
    private double kurs = 0.00;

    public Valuta(String navn, double kurs) {
        navn = this.navn;
        kurs = this.kurs;
    }

    public Valuta() {
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

}
