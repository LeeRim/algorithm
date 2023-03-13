// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/132202?language=mysql

select MCDP_CD as '진료과 코드', count(*) as '5월예약건수'
from APPOINTMENT
where MONTH(APNT_YMD) = 5
group by MCDP_CD
order by count(*), MCDP_CD