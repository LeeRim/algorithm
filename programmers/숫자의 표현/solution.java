// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12924

class Solution {
    public int solution(int n) {

        int answer = 0;
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum > n) {
                    break;
                }
                if (sum == n) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}