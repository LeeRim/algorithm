// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/133026

select i.INGREDIENT_TYPE, sum(f.TOTAL_ORDER) as 'TOTAL_ORDER'
from FIRST_HALF f
join ICECREAM_INFO i on f.FLAVOR = i.FLAVOR
group by i.INGREDIENT_TYPE
order by TOTAL_ORDER