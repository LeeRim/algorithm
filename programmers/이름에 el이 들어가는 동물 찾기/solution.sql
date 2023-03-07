// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59047

select ANIMAL_ID, NAME
from ANIMAL_INS
where NAME like '%el%'
    and ANIMAL_TYPE like 'Dog'
order by NAME