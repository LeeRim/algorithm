// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59410?language=mysql

select ANIMAL_TYPE, IFNULL(NAME, 'No name'), SEX_UPON_INTAKE
from ANIMAL_INS
order by ANIMAL_ID