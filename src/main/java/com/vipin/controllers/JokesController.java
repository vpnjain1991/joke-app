package com.vipin.controllers;

import com.vipin.services.JokeGeneratorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeGeneratorService jokeGeneratorService;

    public JokesController(JokeGeneratorService jokeGeneratorService) {
        this.jokeGeneratorService = jokeGeneratorService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeGeneratorService.getRandomJoke());
        System.out.println(jokeGeneratorService.getRandomJoke());
        return "chucknorris";
    }
}
