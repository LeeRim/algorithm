// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59045

select i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
from ANIMAL_INS i
where i.SEX_UPON_INTAKE like 'Intact%'
    and i.ANIMAL_ID in (
        select o.ANIMAL_ID
        from ANIMAL_OUTS o
        where o.SEX_UPON_OUTCOME not like 'Intact%'
    )