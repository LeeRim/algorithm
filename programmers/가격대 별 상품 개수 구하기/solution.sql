// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131530

select FLOOR(PRICE / 10000) * 10000 as 'PRICE_GROUP', count(*) as 'PRODUCTS'
from PRODUCT
group by PRICE_GROUP
order by PRICE_GROUP