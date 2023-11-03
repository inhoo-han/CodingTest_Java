SELECT i.ingredient_type, sum(f.total_order) AS "TOTAL_ORDER"
    FROM first_half f natural join icecream_info i
    GROUP BY i.ingredient_type
    ORDER BY total_order