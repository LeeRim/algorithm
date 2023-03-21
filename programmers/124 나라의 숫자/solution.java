// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12899

class Solution {
    public String solution(int n) {
        String[] num = {"4", "1", "2"};

        StringBuilder sb = new StringBuilder();
        int answer = n;
        while (answer > 0) {
            int remain = answer % 3;
            answer /= 3;
            sb.append(num[remain]);
            if (remain == 0) {
                answer--;
            }
        }

        return sb.reverse().toString();
    }
}