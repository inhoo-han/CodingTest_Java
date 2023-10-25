-- 코드를 입력하세요
SELECT u.user_id, u.nickname, sum(price) AS 'TOTAL_SALES'
    FROM used_goods_board as b, used_goods_user as u
    WHERE b.writer_id = u.user_id and status = 'DONE'
    GROUP BY u.user_id
    HAVING sum(price) >= 700000
    ORDER BY sum(price)