// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131116

select f.CATEGORY, f.PRICE, f.PRODUCT_NAME
from FOOD_PRODUCT f
join (
    select CATEGORY, max(PRICE) as 'max_price'
    from FOOD_PRODUCT
    where CATEGORY in ('과자', '국', '김치', '식용유')
    group by CATEGORY
) as m on f.CATEGORY = m.CATEGORY
where PRICE = max_price
order by PRICE DESC