package ru.yandex.practicum.filmorate.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import ru.yandex.practicum.filmorate.validation.ReleaseDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class Film {

    int id;
    @NotBlank
    private String name;
    @NotBlank
    @Size(max = 200)
    private String description;
    @NotNull
    @ReleaseDate(message = "Некорректна указана дата релиза.")
    private LocalDate releaseDate;
    @Positive
    private int duration;

}
