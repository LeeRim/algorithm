// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/164668

select USER_ID, NICKNAME, TOTAL_SALES
from USED_GOODS_USER u
join (
    select WRITER_ID, sum(PRICE) as TOTAL_SALES
    from USED_GOODS_BOARD
    where STATUS = 'DONE'
    group by WRITER_ID
    having TOTAL_SALES >= 700000
) t on u.USER_ID = t.WRITER_ID
order by TOTAL_SALES