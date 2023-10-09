package ru.yandex.practicum.filmorate.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.filmorate.model.Genre;
import ru.yandex.practicum.filmorate.service.film.GenreService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/genres")
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;


    @GetMapping
    public List<Genre> findAll() {
        log.info("Получен GET-запрос на получение списка всех жанров");
        return genreService.findAll();
    }

    @GetMapping("/{id}")
    public Genre getGenre(@PathVariable("id") int genreId) {
        log.info("Получен GET-запрос на получение жанра по id: " + genreId);
        return genreService.getGenre(genreId);
    }
}