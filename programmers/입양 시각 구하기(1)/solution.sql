// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/59412

select DATE_FORMAT(DATETIME, '%H') as 'HOUR', count(DATE_FORMAT(DATETIME, '%H')) as 'COUNT'
from ANIMAL_OUTS
where DATE_FORMAT(DATETIME, '%H') >= 9 and DATE_FORMAT(DATETIME, '%H') <= 19
group by DATE_FORMAT(DATETIME, '%H')
having count(DATE_FORMAT(DATETIME, '%H'))
order by HOUR