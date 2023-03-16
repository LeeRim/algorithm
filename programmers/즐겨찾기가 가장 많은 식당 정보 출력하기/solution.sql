// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131123

select r.FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from REST_INFO r
join (
    select FOOD_TYPE, max(FAVORITES) as 'MAX_FAVORITES'
    from REST_INFO
    group by FOOD_TYPE
) as m on r.FOOD_TYPE = m.FOOD_TYPE
where FAVORITES = MAX_FAVORITES
order by FOOD_TYPE DESC