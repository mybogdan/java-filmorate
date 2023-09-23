<h3 align="left">java-filmorate</h3>

###

<div align="center">
  <img height="400" src="https://i.ibb.co/hH6CHy4/2023-09-23-181620.png"  />
</div>

###

<p align="left">/* Лайки */<br><br>SELECT <br>	f.film,<br>	l.user_id<br>FROM film AS f<br>INNER JOIN like AS l ON f.film_id = l.like_id;<br><br><br>/* Жанр фильма */<br><br>SELECT <br>	f.film,<br>	g.genre<br>FROM film AS f<br>INNER JOIN film_genre AS fg ON f.film_id = fg.film_id;<br>INNER JOIN genre AS g ON fg.film_id = g.genre_id;</p>

###
