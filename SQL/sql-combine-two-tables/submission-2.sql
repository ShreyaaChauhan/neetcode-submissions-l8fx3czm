SELECT 
    first_name,
    last_name, 
    city,
    state
FROM person
LEFT JOIN address USING(person_id)
