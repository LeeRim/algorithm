// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59046

select ANIMAL_ID, NAME, SEX_UPON_INTAKE
from ANIMAL_INS
where NAME in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')