// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/144854

select BOOK_ID, AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d')
from BOOK b
join AUTHOR a on b.AUTHOR_ID = a.AUTHOR_ID
where CATEGORY = '경제'
order by PUBLISHED_DATE