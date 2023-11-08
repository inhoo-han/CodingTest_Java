SELECT category, price, product_name
    FROM food_product
    WHERE (category, price) IN (
        -- category와 max(price)를 구한다
        SELECT category, max(price)
        FROM food_product
        GROUP BY category
    ) AND category IN ('과자', '국', '김치', '식용유')
    ORDER BY price desc


    