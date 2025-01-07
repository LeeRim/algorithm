import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		Map<String, Integer> extMap = Map.of("code", 0, "date", 1, "maximum", 2, "remain", 3);

		int extIndex = extMap.get(ext);
		int sortIndex = extMap.get(sort_by);

		List<int[]> answerList = new ArrayList<>();
		for (int[] row : data) {
			if (row[extIndex] < val_ext) {
				answerList.add(row);
			}
		}
		
		answerList.sort(Comparator.comparingInt(row -> row[sortIndex]));

		int[][] answer = answerList.toArray(new int[answerList.size()][]);
		return answer;
	}
}