// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/138477

import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> topk = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            topk.add(score[i]);
            if (topk.size() > k) {
                topk.poll();
            }
            answer[i] = topk.peek();
        }
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
}