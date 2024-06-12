package ru.nasymin.project.Anecdotiki.service;


import ru.nasymin.project.Anecdotiki.model.Jokes;

import java.util.List;
import java.util.Optional;

public interface JokesService {
    List<Jokes> allJokes();

    Optional<Jokes> addNewJoke(Jokes jokes);

    Optional<Jokes> getJokesById(Long id);


    Jokes updateJoke(Jokes jokeToUpdate);

    Jokes deleteJoke(Jokes jokeToDelete);

    Jokes getRandomJoke();
}