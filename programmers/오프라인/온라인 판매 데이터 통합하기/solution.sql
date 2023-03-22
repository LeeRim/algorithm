// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131537

(select DATE_FORMAT(SALES_DATE, '%Y-%m-%d') as 'SALES_DATE', PRODUCT_ID, USER_ID, SALES_AMOUNT
from ONLINE_SALE
where LEFT(SALES_DATE, 7) = '2022-03')
UNION ALL
(select DATE_FORMAT(SALES_DATE, '%Y-%m-%d') as 'SALES_DATE', PRODUCT_ID, NULL as 'USER_ID', SALES_AMOUNT
from OFFLINE_SALE
where LEFT(SALES_DATE, 7) = '2022-03')
order by SALES_DATE, PRODUCT_ID, USER_ID