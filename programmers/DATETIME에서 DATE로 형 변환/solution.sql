// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59414?language=mysql

select ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d')
from ANIMAL_INS
order by ANIMAL_ID