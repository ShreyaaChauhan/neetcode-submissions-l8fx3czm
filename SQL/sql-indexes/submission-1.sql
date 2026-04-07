CREATE TABLE pokemon (
    id INTEGER PRIMARY KEY,
    name TEXT,
    type_id INTEGER
);


CREATE INDEX name_idx ON pokemon (name);

SELECT indexdef
FROM pg_indexes
WHERE tablename = 'pokemon';
