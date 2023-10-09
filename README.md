<h3 align="left">Приложение Filmorate</h3>

###

<p align="left">Сервис, который будет работать с фильмами и оценками пользователей, а также возвращать топ фильмов, рекомендованных к просмотру.</p>

###

<h4 align="left">ER - модель</h4>

###

<div align="center">
  <img height="400" src="https://github.com/mybogdan/java-filmorate/blob/add-database/ER.png"  />
</div>

###

<h4 align="left">Основные запросы</h4>

###

~~~~sql
SELECT *
FROM film
~~~~
- Выборка одного фильма с id 1
~~~~sql
SELECT *
FROM film
WHERE id = 1
~~~~
- Выборка всех пользователей
~~~~sql
SELECT *
FROM user
~~~~
- Выборка одного пользователя с id = 1
~~~~sql
SELECT *
FROM user
WHERE id = 1
~~~~

- Запрос на получение топ 10 популярных фильмов
~~~~sql
SELECT *
FROM film
WHERE film_id IN (
  SELECT
    film_id,
    count(user_id) AS likes_count
  FROM like
  GROUP BY film_id
  ORDER BY likes_count DESC
  LIMIT (10));
~~~~

###
