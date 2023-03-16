// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59042

select o.ANIMAL_ID, o.NAME
from ANIMAL_INS i
right join ANIMAL_OUTS o on i.ANIMAL_ID = o.ANIMAL_ID
where INTAKE_CONDITION is null
order by o.ANIMAL_ID