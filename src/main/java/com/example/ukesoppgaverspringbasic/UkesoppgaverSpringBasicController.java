package com.example.ukesoppgaverspringbasic;

import org.springframework.core.KotlinReflectionParameterNameDiscoverer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UkesoppgaverSpringBasicController {

    @GetMapping("/src/main/resources/static/index.html")
    //oppgave1
    public String returTemp(String strengInn) {
        int innmnd = Integer.parseInt(strengInn);
        Temp Snitt = new Temp();
        return Snitt.maaneder(innmnd);
    }

    //oppgave2
    private ArrayList<Valuta> Kurser = new ArrayList<>();
    private Valuta EUR = new Valuta("Euro", 10.30);
    private Valuta USD = new Valuta("Amerikansk Dollar", 8.30);

    @GetMapping("/utVal")
    public String VisArray() {
        String utVal = "";
        Kurser.add(USD);
        Kurser.add(EUR);
        for (Valuta penger : Kurser) {
            utVal += penger.getValutaNavn() + " " + penger.getKurs() + "<br>";
            System.out.println(penger);
        }
        return utVal;
    }

    @GetMapping("/StringSum")
    public String returValuta() {
        //Strenger
        String innkurs = "";
        String innNavn = "";
        String innVerdi = "";
        String StringSum;
        //desimaler
        double sum = 0;
        double kurs = Integer.parseInt(innkurs);
        double verdi = Integer.parseInt(innVerdi);
        Valuta nykurs = new Valuta(innNavn, kurs);
        Kurser.add(nykurs);

        sum = verdi * nykurs.getKurs();
        StringSum = nykurs.getValutaNavn() + "blir" + sum + " i NOK blir: ";
        return StringSum;
    }

}
