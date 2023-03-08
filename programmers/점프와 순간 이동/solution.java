// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12980

class Solution {

    public int solution(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 2;
            n /= 2;
        }

        return count;
    }
}