package com.example.ukesoppgaverspringbasic;

//oppgave 2
public class Valuta {
    private String valutaNavn;
    private double kurs = 0.00;

    public Valuta(String valutaNavn, double kurs) {
        this.valutaNavn = valutaNavn;
        this.kurs = kurs;
    }

    public Valuta() {
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public String getValutaNavn() {
        return valutaNavn;
    }

    public void setNavn(String navn) {
        this.valutaNavn = navn;
    }

    @Override
    public String toString() {
        return valutaNavn + " " + kurs;

    }
}
