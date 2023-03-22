// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/131124

select MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE, '%Y-%m-%d') as 'REVIEW_DATE'
from MEMBER_PROFILE p
join REST_REVIEW r on p.MEMBER_ID = r.MEMBER_ID
where p.MEMBER_ID = (
    select MEMBER_ID
    from REST_REVIEW
    group by MEMBER_ID
    order by count(*) DESC LIMIT 1
    )
order by REVIEW_DATE, REVIEW_TEXT