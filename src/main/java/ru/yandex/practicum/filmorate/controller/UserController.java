package ru.yandex.practicum.filmorate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.filmorate.exception.AlreadyExistException;
import ru.yandex.practicum.filmorate.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
@Slf4j

public class UserController {

    Map<Integer, User> users = new HashMap<>();

    @GetMapping
    public Collection<User> getFilm() {
        log.info("Поступил запрос на получение списка пользователей.");
        return users.values();
    }

    @PostMapping()
    public User createPost(@RequestBody User user) {
        log.info("Поступил запрос на создание пользователя.");
        return createUser(user);
    }

    @PutMapping()
    public User createPut(@RequestBody User user) {
        log.info("Поступил запрос на обновление пользователя.");
        return updateUser(user);
    }

    public User createUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new AlreadyExistException(String.format(
                    "Пользователь с электронной почтой %s уже зарегистрирован.",
                    user.getEmail()
            ));
        }
        users.put(user.getId(), user);
        return user;
    }

    public User updateUser(User user) {
        users.put(user.getId(), user);

        return user;
    }

}
