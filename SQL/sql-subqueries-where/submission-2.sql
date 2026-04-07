CREATE TABLE pokemon (
    id INTEGER PRIMARY KEY,
    name TEXT
);


SELECT *
FROM pg_indexes
WHERE tablename = 'pokemon';