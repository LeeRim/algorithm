// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131536

select USER_ID, PRODUCT_ID
from ONLINE_SALE
group by USER_ID, PRODUCT_ID
having count(*) > 1
order by USER_ID, PRODUCT_ID DESC