package com.vipin.jokeApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeGeneratorServiceImpl implements JokeGeneratorService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeGeneratorServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
