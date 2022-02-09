package com.example.ukesoppgaverspringbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UkesoppgaverSpringBasicController {

    @GetMapping("/")
   public int innmnd=0;
    public String returTemp(int innmnd){
        Temp Snitt=new Temp();
        return Snitt.måneder(innmnd);
    }

}
