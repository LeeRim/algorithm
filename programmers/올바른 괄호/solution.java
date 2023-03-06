// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12909

class Solution {
    boolean solution(String s) {
            boolean answer = true;

            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    count++;
                } else {
                    count--;
                }

                if (count < 0) {
                    answer = false;
                    break;
                }
            }

            if (count > 0) {
                answer = false;
            }

            // System.out.println(answer);

            return answer;
        }
}