// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/43165

class Solution {
        int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        getSum(numbers, 0, 0, target);
        return answer;
    }

    public void getSum(int[] numbers, int index, int sum, int target) {
        if (numbers.length == index) {
            if (sum == target) {
                answer++;
            }
            return;
        }
        
        getSum(numbers, index + 1, sum + numbers[index], target);
        getSum(numbers, index + 1, sum - numbers[index], target);
    }
}