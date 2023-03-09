// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131529

select LEFT(PRODUCT_CODE, 2) as 'CATEGORY', count(*) as 'PRODUCTS'
from PRODUCT
group by CATEGORY
order by CATEGORY