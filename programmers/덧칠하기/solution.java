// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/161989

class Solution {
    public int solution(int n, int m, int[] section) {

        int count = 0;
        int max = 0;
        for (int i = 0; i < section.length; i++) {
            if (section[i] < max) {
                continue;
            }
            count++;
            max = section[i] + m;
        }

        return count;
    }
}