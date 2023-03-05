// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/135808

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> scores = Arrays.stream(score).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int total = 0;
        for (int i = 0; i < scores.size(); i++) {
            if ((i + 1) % m == 0) {
                total += scores.get(i) * m;
            }
        }
//        System.out.println(total);
        return total;
    }
}