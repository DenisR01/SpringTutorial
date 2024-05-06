package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Expose a "/" endpoint that returns a Hello world

    @Value("${coach.name}")
    private String coachName;

    @Value("${player.name}")
    private String playerName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    //expose a new endpoint for fortune

    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day!";
    }

    @GetMapping("/playerinfo")
    public String getPlayerInfo(){
        return "The player: "+playerName+" is trained by: "+coachName;
    }
}
