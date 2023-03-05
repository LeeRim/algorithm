// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42862

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        Set<Integer> lostList = Arrays.stream(lost)
                .boxed()
                .collect(Collectors.toSet());

        for (int i = 0; i < reserve.length; i++) {
            if (lostList.contains(reserve[i])) {
                lostList.remove(reserve[i]);
                reserve[i] = -1;
                continue;
            }
            if (lostList.contains(reserve[i] - 1) && lostList.contains(reserve[i] + 1)) {
                continue;
            }
            if (lostList.contains(reserve[i] - 1)) {
                lostList.remove(reserve[i] - 1);
                reserve[i] = -1;
                continue;
            }
            if (lostList.contains(reserve[i] + 1)) {
                lostList.remove(reserve[i] + 1);
                reserve[i] = -1;
            }
        }

        for (int i = 0; i < reserve.length; i++) {
            if (reserve[i] == -1) {
                continue;
            }
            if (lostList.contains(reserve[i] - 1)) {
                lostList.remove(reserve[i] - 1);
                reserve[i] = -1;
                continue;
            }
            if (lostList.contains(reserve[i] + 1)) {
                lostList.remove(reserve[i] + 1);
                reserve[i] = -1;
            }
        }

        int answer = n - lostList.size();
        return answer;
    }
}