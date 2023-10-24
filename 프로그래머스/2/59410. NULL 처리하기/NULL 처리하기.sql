SELECT animal_type, 
        CASE WHEN (name is NULL) THEN 'No name'
        else name
        end as name,
        sex_upon_intake
    FROM animal_ins
    ORDER BY animal_id