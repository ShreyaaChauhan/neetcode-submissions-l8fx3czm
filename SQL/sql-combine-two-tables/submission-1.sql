SELECT 
    first_name,
    last_name, 
    city,
    state
FROM person
JOIN address USING(person_id)
