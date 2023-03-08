// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12980

import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;

        int sqrt;
        while (n > 1) {
            ans += n % 2;
            n /= 2;
        }

//        System.out.println(ans);
        return ans;
    }
}