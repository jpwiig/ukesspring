package com.example.ukesoppgaverspringbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UkesoppgaverSpringBasicController {
    public int innmnd=0;
    @GetMapping("/")
    public String returTemp(int innmnd){
        Temp Snitt=new Temp();
        return Snitt.maaneder(innmnd);
    }

}
