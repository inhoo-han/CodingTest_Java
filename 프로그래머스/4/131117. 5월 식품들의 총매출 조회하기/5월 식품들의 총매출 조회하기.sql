SELECT p.product_id, p.product_name, sum(p.price * o.amount) AS "TOTAL_SALES"
    FROM food_product p JOIN food_order o ON p.product_id = o.product_id
    WHERE TO_CHAR(o.produce_date, 'YYYY-MM') = '2022-05'
    GROUP BY p.product_id, p.product_name
    ORDER BY TOTAL_SALES desc, product_id