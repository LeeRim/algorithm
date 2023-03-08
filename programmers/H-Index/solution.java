// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42747

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int count = 0;
        for (int i = 0; i < citations.length; i++) {
            count = citations.length - i;
            if (citations[i] >= count) {
                answer = count;
                break;
            }
        }
        // System.out.println(answer);
        return answer;
    }
}