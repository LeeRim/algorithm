// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131117

select p.PRODUCT_ID, p.PRODUCT_NAME, p.PRICE * sum(o.AMOUNT) as 'TOTAL_SALES'
from FOOD_PRODUCT p
join FOOD_ORDER o on p.PRODUCT_ID = o.PRODUCT_ID
where LEFT(o.PRODUCE_DATE, 7) = '2022-05'
group by p.PRODUCT_ID
order by TOTAL_SALES DESC, p.PRODUCT_ID