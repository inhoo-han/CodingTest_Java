SELECT animal_id, name 
    FROM animal_ins 
    WHERE name like '%el%' and animal_type = 'Dog'
    ORDER BY name