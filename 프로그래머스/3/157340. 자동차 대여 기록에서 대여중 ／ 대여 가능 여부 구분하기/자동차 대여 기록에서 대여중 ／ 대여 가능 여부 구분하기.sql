
SELECT car_id, CASE WHEN OX = 1 THEN '대여중'
                    ELSE '대여 가능'
                    END AS AVAILABILITY
    FROM (
        SELECT car_id, sum(CASE WHEN '2022-10-16' BETWEEN TO_CHAR(start_date, 'YYYY-MM-DD') AND TO_CHAR(end_date, 'YYYY-MM-DD') THEN 1
                      ELSE 0
                      END) AS OX
        FROM car_rental_company_rental_history
        GROUP BY car_id
        ORDER BY car_id desc
    )

