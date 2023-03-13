// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131120

select MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d')
from MEMBER_PROFILE
where GENDER = 'W'
    and MONTH(DATE_OF_BIRTH) = 3 
    and TLNO is not null
order by MEMBER_ID