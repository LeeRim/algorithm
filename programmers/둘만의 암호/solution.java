// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/155652?language=java

class Solution {
    public String solution(String s, String skip, int index) {

        char[] newAlphabet = new char[26 - skip.length()];
        int alphaIdx = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            if (skip.contains(String.valueOf((char)i))) {
                continue;
            }
            newAlphabet[alphaIdx] = (char) i;
            alphaIdx++;
        }

        alphaIdx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < newAlphabet.length; j++) {
                if (newAlphabet[j] == s.charAt(i)) {
                    alphaIdx = j + index;
                    if (alphaIdx >= newAlphabet.length) {
                        alphaIdx %= newAlphabet.length;
                    }
                    sb.append(newAlphabet[alphaIdx]);
                }
            }
        }

        return sb.toString();
    }
}