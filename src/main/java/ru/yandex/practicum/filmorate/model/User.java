package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class User {

    private Integer id;
    @NotBlank
    @Email(message = "Некорректный email.")
    private String email;
    @NotBlank(message = "Логин не может быть пустым.")
    private String login;
    private String name;
    @NotNull
    @PastOrPresent(message = "Некорректна указана дата рождения.")
    private LocalDate birthday;

}
