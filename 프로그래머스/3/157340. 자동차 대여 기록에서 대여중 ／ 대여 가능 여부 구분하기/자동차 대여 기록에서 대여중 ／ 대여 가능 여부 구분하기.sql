SELECT c.car_id, CASE WHEN sum(yn) = 0 THEN '대여 가능'
                      ELSE '대여중'
                      END AS availability
    FROM car_rental_company_rental_history c JOIN (
        SELECT car_id, (CASE WHEN TO_CHAR(start_date, 'YYYY-MM-DD') <= '2022-10-16' AND 
                         TO_CHAR(end_date, 'YYYY-MM-DD') >= '2022-10-16' THEN 1
                    ELSE 0
                    END) AS yn  
            FROM car_rental_company_rental_history
        ) a ON c.car_id = a.car_id
    GROUP BY c.car_id
    ORDER BY c.car_id desc