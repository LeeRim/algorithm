// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59413

WITH RECURSIVE HOURS AS (
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
      FROM HOURS
     WHERE HOUR < 23
)
select h.HOUR, IFNULL(c.OUT_COUNT, 0) as 'COUNT'
from HOURS h
left join (
    select HOUR(DATETIME) as 'HOUR', count(*) as 'OUT_COUNT'
    from ANIMAL_OUTS
    group by HOUR(DATETIME)
) as c on h.HOUR = c.HOUR