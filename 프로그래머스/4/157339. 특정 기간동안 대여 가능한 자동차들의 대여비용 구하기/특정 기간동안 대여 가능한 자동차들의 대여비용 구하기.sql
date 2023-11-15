-- 1. car_id, car_type, fee를 출력
-- 2. order by fee desc, car_type, car_id desc
-- 3. car_type = '세단' or 'SUV'

SELECT car_id, car_type, (daily_fee * (1-discount_rate/100)) * 30 AS FEE
-- SELECT *
    FROM car_rental_company_car natural join car_rental_company_discount_plan
    WHERE car_id NOT IN (
        
        SELECT distinct(car_id)
        FROM car_rental_company_rental_history
        WHERE TO_CHAR(end_date, 'YYYY-MM') >= '2022-11'
        
        
    ) AND regexp_like(car_type, '세단|SUV')
    AND duration_type = '30일 이상'
    AND (daily_fee * (1-discount_rate/100)) * 30 >= 500000
    AND (daily_fee * (1-discount_rate/100)) * 30 < 2000000
    ORDER BY fee desc, car_type asc, car_id desc