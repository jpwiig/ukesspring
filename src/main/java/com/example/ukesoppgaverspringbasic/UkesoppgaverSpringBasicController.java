package com.example.ukesoppgaverspringbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UkesoppgaverSpringBasicController {

    @GetMapping("/")
    public String returTemp(String strengInn){
        int innmnd= Integer.parseInt(strengInn);
        Temp Snitt=new Temp();
        return Snitt.maaneder(innmnd);
    }

}
