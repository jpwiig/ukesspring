package com.example.ukesoppgaverspringbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
public String returValuta(String innSum){
        Valuta kurs= new Valuta();

        double sumutregn=Double.parseDouble(innSum);

    }
}
