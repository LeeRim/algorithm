class Solution {
    public int[] solution(int[] sequence, int k) {

		int[] answer = {0, sequence.length};

		int start = 0;
		int end = 0;
		int sum = sequence[0];
		while (!((sum < k && end == sequence.length - 1) || (sum > k && start == sequence.length - 1))) {
			if (sum == k) {
				if (end - start < answer[1] - answer[0]) {
					answer[0] = start;
					answer[1] = end;
				}
				sum -= sequence[start];
				start++;
			} else if (sum < k) {
				end++;
				sum += sequence[end];
			} else {
				sum -= sequence[start];
				start++;
			}
		}

		return answer;
	}
}