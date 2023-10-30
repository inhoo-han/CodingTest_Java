
SELECT a.apnt_no, p.pt_name, p.pt_no, d.mcdp_cd, d.dr_name, a.apnt_ymd
    FROM appointment a
        JOIN patient p ON a.pt_no = p.pt_no 
        JOIN doctor d ON a.mddr_id = d.dr_id
    WHERE a.mcdp_cd = 'CS' AND apnt_cncl_yn = 'N' AND TO_CHAR(a.apnt_ymd, 'YYYY-MM-DD') = '2022-04-13'
    ORDER BY a.apnt_ymd