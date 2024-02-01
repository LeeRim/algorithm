// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12928

class Solution {
    public int solution(int n) {
        if(n < 2){
            return n;
        }
        int answer = n + 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}