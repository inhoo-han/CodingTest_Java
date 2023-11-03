SELECT floor(price / 10000) * 10000 AS price_group, count(*) AS PRODUCTS
    FROM product
    GROUP BY floor(price / 10000) * 10000
    ORDER BY price_group