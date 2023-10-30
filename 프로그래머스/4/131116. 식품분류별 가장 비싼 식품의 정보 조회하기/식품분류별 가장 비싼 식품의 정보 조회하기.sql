

SELECT category, price, product_name
    FROM food_product p
    WHERE (p.category, p.price) IN
        (SELECT category, max(price) 
            FROM food_product
            GROUP BY category) 
        
        AND
        category IN ('과자', '국', '김치', '식용유')
        
    ORDER BY price desc
