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
    @GetMapping("/src/main/resources/static/index.html/UT")
    public String VisArray(Valuta UT) {
    UT= new Valuta();
        return UT.utskrift();
    }

    @GetMapping("/src/main/resources/static/index2.html")
    public String returValuta(String innSum, String innkurs) {
        double sumutregn = Double.parseDouble(innSum);
        double kurs=Double.parseDouble(innkurs);
        double sum = sumutregn * kurs;

        return "Det blir " + sum + " i Norske kroner ";
    }

}
