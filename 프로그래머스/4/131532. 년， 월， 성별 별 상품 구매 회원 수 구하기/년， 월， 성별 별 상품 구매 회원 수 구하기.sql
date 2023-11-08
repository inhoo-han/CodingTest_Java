SELECT extract(year from sales_date) AS YEAR, 
       extract(month from sales_date) AS MONTH,
       gender, count(distinct(user_id)) AS USERS
       FROM user_info NATURAL JOIN online_sale
       WHERE gender is not NULL
       GROUP BY extract(year from sales_date), extract(month from sales_date), gender
       ORDER BY year, month, gender