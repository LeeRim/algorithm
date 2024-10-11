import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yearingMap = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			yearingMap.put(name[i], yearning[i]);
		}

		int[] answer = new int[photo.length];
		for (int i = 0; i < photo.length; i++) {
			for (int j = 0; j < photo[i].length; j++) {
				if (yearingMap.containsKey(photo[i][j])) {
					answer[i] += yearingMap.get(photo[i][j]);
				}
			}
		}
		return answer;
    }
}