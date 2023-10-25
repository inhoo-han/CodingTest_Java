SELECT h.car_id
    FROM car_rental_company_car as c, car_rental_company_rental_history as h
    WHERE c.car_id = h.car_id and c.car_type = '세단' and h.start_date like '2022-10%'
    GROUP BY h.car_id
    ORDER BY h.car_id desc