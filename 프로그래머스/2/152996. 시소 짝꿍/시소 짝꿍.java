import java.util.HashMap;
import java.util.Map;

class Solution {
    public long solution(int[] weights) {
		Map<Integer, Integer> counts = new HashMap<>();
		for (int weight : weights) {
			counts.put(weight, counts.getOrDefault(weight, 0) + 1);
		}

		long answer = 0;
		Map<Integer, Integer> temp = new HashMap<>();
		for (int weight : weights) {
			temp = new HashMap<>(counts);
			temp.put(weight, temp.get(weight) - 1);

			long count = temp.getOrDefault(weight, 0);
			if (weight % 4 == 0) {
				count += temp.getOrDefault(weight * 3 / 4, 0);
			}
			if (weight % 2 == 0) {
				count += temp.getOrDefault(weight / 2, 0) + temp.getOrDefault(weight * 3 / 2, 0);
			}
			if (weight % 3 == 0) {
				count += temp.getOrDefault(weight * 2 / 3, 0) + temp.getOrDefault(weight * 4 / 3, 0);
			}
			count += temp.getOrDefault(weight * 2, 0);

			answer += count;
		}

		return answer / 2;
	}
}