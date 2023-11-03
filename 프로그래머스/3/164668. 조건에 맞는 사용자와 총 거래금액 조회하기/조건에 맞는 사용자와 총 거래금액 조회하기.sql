-- 1. 거래 완료된 품목
-- 2. 총 금액이 700,000원 이상
-- 3. ORDER BY 총거래금액

SELECT b.writer_id, u.nickname, sum(price) AS total_price
    FROM used_goods_board b JOIN used_goods_user u ON b.writer_id = u.user_id
    WHERE status = 'DONE'
    GROUP BY b.writer_id, u.nickname
    HAVING sum(price) >= 700000
    ORDER BY total_price