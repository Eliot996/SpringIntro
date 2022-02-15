package com.example.springintro.controllers;

import com.example.springintro.services.IsItFriday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    @GetMapping
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String input) {
        return "Your input was: " + input;
    }

    @GetMapping("/is-it-friday")
    public String isItFriday() {
        IsItFriday isItFriday = new IsItFriday();
        String day = isItFriday.getDayOfTheWeek();

        if (day.equals("friday")) {
            return "juuhuu it is friday!";
        } else {
            return "It is not friday :( " +
                    " <br>It is " + day;
        }
    }

}
