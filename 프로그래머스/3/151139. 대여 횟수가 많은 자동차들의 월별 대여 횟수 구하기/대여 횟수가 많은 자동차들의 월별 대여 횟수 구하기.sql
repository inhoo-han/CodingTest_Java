SELECT extract(month from start_date) as month, car_id, count(car_id) as records
FROM car_rental_company_rental_history
WHERE car_id IN(
    SELECT car_id
    FROM car_rental_company_rental_history
    WHERE start_date BETWEEN to_date('2022-08-01','YYYY-MM-DD') AND to_date('2022-10-31','YYYY-MM-DD')
    GROUP BY car_id
    HAVING count(*) >= 5
) AND start_date BETWEEN to_date('2022-08-01','YYYY-MM-DD') AND to_date('2022-10-31','YYYY-MM-DD')
GROUP BY extract(month from start_date), car_id
HAVING count(*) > 0
ORDER BY extract(month from start_date), car_id desc;