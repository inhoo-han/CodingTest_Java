-- SELECT i.rest_id, i.rest_name, i.food_type, i.favorites, i.address, NVL(r.score, 0) AS score
    -- FROM rest_info i left outer join (
    --     SELECT rest_id, round(avg(review_score), 2) AS score
    --     FROM rest_review
    --     GROUP BY rest_id
    -- ) r ON i.rest_id = r.rest_id
    
SELECT rest_id, rest_name, food_type, favorites, address, score
    FROM rest_info natural join (
        SELECT rest_id, round(avg(review_score), 2) AS score
        FROM rest_review
        GROUP BY rest_id
    )
    
    WHERE regexp_like(address, '서울특별시|서울시')
    ORDER BY NVL(score, 0) desc, favorites desc