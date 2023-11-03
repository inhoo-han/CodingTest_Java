-- 1. 거래 완료된 품목
-- 2. 총 금액이 700,000원 이상
-- 3. ORDER BY 총거래금액

SELECT u.user_id, u.nickname, b.total_price
    FROM used_goods_user u JOIN (
        SELECT writer_id, sum(price) AS total_price
            FROM used_goods_board
            WHERE status = 'DONE'
            GROUP BY writer_id
    ) b ON u.user_id = b.writer_id
    WHERE total_price >= 700000
    ORDER BY total_price