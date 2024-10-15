class Solution {
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];
        
        int[] x = {1, 0, -1, 0};
        int[] y = {0, 1, 0, -1};
        
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            if (h + x[i] < 0 || w + y[i] < 0 || h + x[i] >= board.length || w + y[i] >= board.length) continue;
            
            if (board[h + x[i]][w + y[i]].equals(color)){
                answer++;
            }
        }
        
        return answer;
    }
}