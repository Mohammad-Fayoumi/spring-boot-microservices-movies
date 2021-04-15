CREATE TABLE `rating`
(
    `movie_id` varchar(50) NOT NULL,
    `rating` double unsigned NOT NULL,
    PRIMARY KEY (`movie_id`)
);

insert into rating(movie_id, rating)
values ('tfs', 8.1);
insert into rating(movie_id, rating)
values ('vks', 8.4);
insert into rating(movie_id, rating)
values ('tkn', 7.6);
insert into rating(movie_id, rating)
values ('dnt', 9.5);