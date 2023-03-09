// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59409

select ANIMAL_ID, NAME, IF(SEX_UPON_INTAKE REGEXP 'Neutered|Spayed', 'O', 'X') as '중성화'
from ANIMAL_INS
order by ANIMAL_ID