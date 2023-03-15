// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/144855

select b.CATEGORY, sum(s.SALES) as 'TOTAL_SALES'
from BOOK b
join BOOK_SALES s on b.BOOK_ID = s.BOOK_ID
where LEFT(s.SALES_DATE, 7) = '2022-01'
group by b.CATEGORY
order by b.CATEGORY