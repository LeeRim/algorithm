// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12924

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            num = i;
            while (sum < n) {
                num++;
                sum += num;
            }
            if (sum == n) {
                answer++;
            }
        }
        System.out.println(answer);
        return answer;
    }
}