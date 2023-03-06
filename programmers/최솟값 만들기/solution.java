// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12941

import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int len = A.length;
        int answer = 0;
        for (int i = 0; i < len; i++) {
            answer += A[i] * B[len - i - 1];
        }

        return answer;
    }
}