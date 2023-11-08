SELECT a.hour, coalesce(count, 0) AS count
    FROM (
        SELECT level - 1 AS hour
        FROM dual
        CONNECT BY level <= 24
    ) a LEFT JOIN (
        SELECT extract(hour from cast(datetime as timestamp)) AS hour, count(*) AS count
        FROM animal_outs
        GROUP BY extract(hour from cast(datetime as timestamp))
    ) b ON a.hour = b.hour
    ORDER BY hour