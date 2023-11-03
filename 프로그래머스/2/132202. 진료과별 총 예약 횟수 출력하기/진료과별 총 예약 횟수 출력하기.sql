SELECT mcdp_cd as "진료과 코드", count(*) as "5월예약건수"
    FROM appointment
    WHERE TO_CHAR(apnt_ymd, 'YYYY-MM') = '2022-05'
    GROUP BY mcdp_cd
    ORDER BY count(*), mcdp_cd