package ru.yandex.practicum.filmorate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.exception.AlreadyExistException;
import ru.yandex.practicum.filmorate.model.Film;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/films")
@Slf4j
public class FilmController {

    Map<Integer, Film> films = new HashMap<>();

    @GetMapping
    public Collection<Film> getFilm() {
        log.info("Поступил запрос на получение списка всех фильмов.");
        return films.values();
    }

    @PostMapping()
    public Film createPost(@RequestBody Film film) {
        log.info("Поступил запрос на добавление фильма.");
        return createFilm(film);
    }

    @PutMapping()
    public Film createPut(@RequestBody Film film) {
        log.info("Поступил запрос на изменения фильма.");
        return updateFilm(film);
    }

    public Film createFilm(Film film) {
        if (films.containsKey(film.getId())) {
            throw new AlreadyExistException(String.format(
                    "Фильм %s уже есть в списке.",
                    film.getName()
            ));
        }
        films.put(film.getId(), film);
        return film;
    }

    public Film updateFilm(Film film) {
        films.put(film.getId(), film);

        return film;
    }

}
