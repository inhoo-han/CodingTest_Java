SELECT distinct(u.user_id), u.nickname, (u.city || ' ' || u.street_address1 || ' ' || u.street_address2) as "전체주소",
        substr(u.tlno, 1, 3) || '-' || substr(u.tlno, 4, 4) || '-' || substr(u.tlno, 8, 4) as "전화번호"
    FROM used_goods_board b JOIN used_goods_user u ON b.writer_id = u.user_id
    WHERE u.user_id IN (SELECT writer_id
                            FROM used_goods_board
                            GROUP BY writer_id
                            HAVING count(writer_id) >= 3
                       )
    ORDER BY u.user_id desc