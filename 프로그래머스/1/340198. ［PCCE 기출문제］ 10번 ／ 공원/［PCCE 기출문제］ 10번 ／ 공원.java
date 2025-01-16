import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public final int[] x = {1, 0};
	public final int[] y = {0, 1};
	boolean[][] visited = null;
    
    public int solution(int[] mats, String[][] park) {
		Arrays.sort(mats);
		for (int i = 0; i < mats.length / 2; i++) {
			int temp = mats[i];
			mats[i] = mats[mats.length - i - 1];
			mats[mats.length - i - 1] = temp;
		}
		
		visited = new boolean[park.length][park[0].length];

		int max = 0;
		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[i].length; j++) {
				if (park[i][j].equals("-1") && !visited[i][j]) {
					int[] start = {i, j};
					int partMax = getPartMax(park, start);
					max = Math.max(max, partMax);
				}
			}
		}

		int answer = -1;
		for (int mat : mats) {
			if (max >= mat) {
				answer = mat;
				break;
			}
		}

		return answer;
	}

	// 가능한 최대의 정사각형 크기를 반환
	public int getPartMax(String[][] park, int[] start) {
		boolean[][] visited = new boolean[park.length][park[0].length];

		Deque<int[]> bfs = new ArrayDeque<>();
		bfs.add(start);

		int max = Math.min(park.length - start[0], park[0].length - start[1]);
		while (!bfs.isEmpty()) {
			int[] now = bfs.poll();

			if (now[0] >= start[0] + max || now[1] >= start[1] + max) {
				continue;
			}
			if (!park[now[0]][now[1]].equals("-1")) {
				max = Math.max(now[0] - start[0], now[1] - start[1]);
				continue;
			}

			for (int i = 0; i < 2; i++) {
				int nx = now[0] + x[i];
				int ny = now[1] + y[i];

				if (nx >= start[0] + max || ny >= start[1] + max || visited[nx][ny]) {
					continue;
				}

				bfs.add(new int[] {nx, ny});
				visited[nx][ny] = true;
			}
		}

		return max;
	}
}