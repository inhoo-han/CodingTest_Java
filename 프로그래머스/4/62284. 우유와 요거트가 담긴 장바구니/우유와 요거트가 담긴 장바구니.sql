SELECT cart_id
    FROM cart_products
    WHERE cart_id IN (
        SELECT cart_id
        FROM cart_products
        WHERE name = 'Yogurt'
    ) AND name = 'Milk'
    ORDER BY cart_id


    