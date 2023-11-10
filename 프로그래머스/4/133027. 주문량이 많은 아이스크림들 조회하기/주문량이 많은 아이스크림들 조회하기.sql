SELECT flavor
    FROM (
        SELECT f.flavor, sum(f.total_order + j.total_order) AS total_order
        FROM first_half f JOIN july j ON f.flavor = j.flavor 
        GROUP BY f.flavor
        ORDER BY total_order desc
    ) 
    WHERE rownum <= 3

