// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59041

select NAME, count(NAME)
from ANIMAL_INS
where NAME IS NOT NULL
group by NAME
having count(NAME) > 1
order by NAME