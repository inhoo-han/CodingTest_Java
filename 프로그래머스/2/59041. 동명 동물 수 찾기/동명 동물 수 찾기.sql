SELECT name, count(*)
FROM animal_ins
WHERE name is not null
GROUP BY name
HAVING count(*) > 1
ORDER BY name