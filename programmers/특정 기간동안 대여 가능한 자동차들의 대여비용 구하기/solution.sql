// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/157339

select c.CAR_ID, CAR_TYPE, FEE
from CAR_RENTAL_COMPANY_CAR c
left join (
    select CAR_ID, FLOOR(daily_fee * (100 - DISCOUNT_RATE) * 0.3) as FEE
    from CAR_RENTAL_COMPANY_CAR c
    left join CAR_RENTAL_COMPANY_DISCOUNT_PLAN d on c.CAR_TYPE = d.CAR_TYPE
    where DURATION_TYPE = '30일 이상'
) as f on c.CAR_ID = f.CAR_ID
where c.CAR_ID not in (
    select CAR_ID
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where END_DATE between DATE('2022-11-01') and DATE('2022-11-30')
    or (START_DATE >= DATE('2022-11-01') and START_DATE <= DATE('2022-11-30'))
    or (START_DATE <= DATE('2022-11-01') and END_DATE >= DATE('2022-11-30'))
)
and FEE >= 500000 and FEE < 2000000
order by FEE DESC, CAR_TYPE, c.CAR_ID DESC