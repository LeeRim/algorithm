// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12980

class Solution {

    public int solution(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                continue;
            }
            count++;
            n--;
        }

        return count;
    }
}