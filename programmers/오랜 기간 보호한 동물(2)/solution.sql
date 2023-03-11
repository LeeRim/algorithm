// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59411

select i.ANIMAL_ID, i.NAME
from ANIMAL_INS i
join ANIMAL_OUTS o on i.ANIMAL_ID = o.ANIMAL_ID
order by o.DATETIME - i.DATETIME desc
limit 2;