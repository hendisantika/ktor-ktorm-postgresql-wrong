CREATE TABLE book
(
    id   serial  NOT NULL,
    name varchar NOT NULL UNIQUE
);

INSERT INTO book(name)
VALUES ('Book #1');
INSERT INTO book(name)
VALUES ('Book #2');