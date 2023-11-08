SELECT a.author_id, a.author_name, b.category, sum(s.sales * b.price) AS total_sales
    FROM book b 
         JOIN author a ON b.author_id = a.author_id
         JOIN book_sales s ON b.book_id = s.book_id
    WHERE TO_CHAR(s.sales_date, 'YYYY-MM') = '2022-01'
    GROUP BY a.author_id, a.author_name, b.category
    ORDER BY a.author_id, b.category desc