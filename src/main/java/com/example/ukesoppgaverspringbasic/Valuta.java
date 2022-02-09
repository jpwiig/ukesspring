package com.example.ukesoppgaverspringbasic;

//oppgave 2
public class Valuta {
    private String navn;
    private double kurs = 0.00;
    private String innSum;
    private double sum=0;

    public Valuta(String navn, double kurs, double sum, String innSum) {
        navn = this.navn;
        innSum=this.innSum;
        kurs = this.kurs;
        sum = this.sum;

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
