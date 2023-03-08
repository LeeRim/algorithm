// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59040

select ANIMAL_TYPE, count(ANIMAL_TYPE)
from ANIMAL_INS
group by ANIMAL_TYPE
having ANIMAL_TYPE IN ('Cat', 'Dog')
order by ANIMAL_TYPE