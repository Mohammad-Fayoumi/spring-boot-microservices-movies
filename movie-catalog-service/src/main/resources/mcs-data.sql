CREATE TABLE `catalog_item` (
    `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(50)   DEFAULT NULL,
    `description` varchar(255)   DEFAULT NULL,
    `rating` double DEFAULT 0.0,
    PRIMARY KEY (`id`)
);

# insert into catalog_item(name,description,rating) values('Transforms', 'Test desc', 5.4);
# insert into catalog_item(name,description,rating) values('Vikings', 'Test desc', 9);
# insert into catalog_item(name,description,rating) values('Taken', 'Test desc', 8.5);
# insert into catalog_item(name,description,rating) values('Dark Night', 'Test desc', 7.3);
