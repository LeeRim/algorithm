// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42747

class Solution {
    public int solution(int[] citations) {

        int[] hashing = new int[10001];
        for (int citation : citations) {
            hashing[citation]++;
        }

        int h = 0;
        int count = 0;
        for (int i = 10000; i >= 0; i--) {
            count += hashing[i];
            if (count >= i) {
                h = i;
                break;
            }
        }

        return h;
    }
}