<h3 align="left">Приложение Filmorate</h3>

###

<p align="left">Сервис, который будет работать с фильмами и оценками пользователей, а также возвращать топ фильмов, рекомендованных к просмотру.</p>

###

<h4 align="left">ER - модель</h4>

###

<div align="center">
  <img height="400" src="https://i.ibb.co/hH6CHy4/2023-09-23-181620.png"  />
</div>

###

<h4 align="left">Основные запросы</h4>

###

~~~~sql
SELECT * FROM films
~~~~
- Выборка одного фильма с id 1
~~~~sql
SELECT * FROM films WHERE id = 1
~~~~
- Выборка всех пользователей
~~~~sql
SELECT * FROM users
~~~~
- Выборка одного пользователя с id = 1
~~~~sql
SELECT * FROM users WHERE id = 1
~~~~

- Запрос на получение топ 10 популярных фильмов
~~~~sql
SELECT *
FROM film
WHERE film_id IN (SELECT film_id, count(user_id) AS likes_count
FROM likes
GROUP BY film_id
ORDER BY likes_count DESC
LIMIT (10));
~~~~

###
