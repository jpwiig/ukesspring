package com.example.ukesoppgaverspringbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UkesoppgaverSpringBasicController {

    @GetMapping("/src/main/resources/static/index.html")
    //oppgave1
    public String returTemp(String strengInn){
        int innmnd= Integer.parseInt(strengInn);
        Temp Snitt=new Temp();
        return Snitt.maaneder(innmnd);
    }

    //oppgave2
    @GetMapping("/src/main/resources/static/index.html/utVal")
    public String VisArray(String utVal) {
        ArrayList<Valuta> Kurser = new ArrayList<>();
        Valuta EUR = new Valuta("Euro", 10.30);
        Valuta USD = new Valuta("Amerikansk Dollar", 8.30);
        Kurser.add(EUR);
        Kurser.add(USD);

        for (Valuta penger : Kurser) {
          utVal= penger.getNavn() + " " + penger.getKurs() +"\n";
        }
        return utVal;
    }

    @GetMapping("/src/main/resources/static/index2.html")
    public String returValuta(String innSum) {
        double sumutregn = Double.parseDouble(innSum);
        double nykurs = sumutregn;

        return "Det blir " + nykurs + " i Norske kroner ";
    }

}
