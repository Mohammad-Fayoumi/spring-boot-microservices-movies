CREATE TABLE `movie`
(
    `movie_id` varchar(50) NOT NULL,
    `name`     varchar(255) DEFAULT NULL,
    PRIMARY KEY (`movie_id`)
);

insert into movie(movie_id, name)
values ('tfs', 'Transforms');
insert into movie(movie_id, name)
values ('vks', 'Vikings');
insert into movie(movie_id, name)
values ('tkn', 'Taken');
insert into movie(movie_id, name)
values ('dnt', 'Dark Night');
