SELECT b.category, sum(s.sales) AS total_sales
    FROM book b natural join book_sales s
    WHERE TO_CHAR(s.sales_date, 'YYYY-MM') = '2022-01'
    GROUP BY b.category
    ORDER BY b.category