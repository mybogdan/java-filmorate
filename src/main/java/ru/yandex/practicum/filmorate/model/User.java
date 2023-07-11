package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class User {

    int id;
    @NotBlank
    @Email(message = "Некорректный email.")
    String email;
    @NotBlank(message = "Логин не может быть пустым.")
    String login;
    String name;
    @NotNull
    @PastOrPresent(message = "Некорректна указана дата рождения.")
    LocalDate birthday;

}
