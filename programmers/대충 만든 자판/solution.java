// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/160586

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> counts = new HashMap<>();
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                if (counts.containsKey(key)) {
                    counts.replace(key, Math.min(counts.get(key), i + 1));
                    continue;
                }
                counts.put(key, i + 1);
            }
        }

        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                if (!counts.containsKey(targets[i].charAt(j))) {
                    answer[i] = -1;
                    break;
                }
                answer[i] += counts.get(targets[i].charAt(j));
            }
        }
        return answer;
    }
}