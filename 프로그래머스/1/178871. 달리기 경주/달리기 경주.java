import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
		Map<String, Integer> playerIndex = new HashMap<>();
		for (int i = 0; i < players.length; i++) {
			playerIndex.put(players[i], i);
		}

		for (String calling : callings) {
			Integer callingIndex = playerIndex.get(calling);

			String temp = players[callingIndex - 1];

			players[callingIndex - 1] = calling;
			players[callingIndex] = temp;

			playerIndex.put(calling, callingIndex - 1);
			playerIndex.put(temp, callingIndex);
		}

		String[] answer = players;
		return answer;
	}
}