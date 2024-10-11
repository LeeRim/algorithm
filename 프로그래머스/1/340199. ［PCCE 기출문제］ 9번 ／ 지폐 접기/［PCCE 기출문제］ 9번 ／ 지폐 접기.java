class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while (!isSmall(wallet, bill)) {
            answer++;
            bill = slip(bill);
        }
        
        return answer;
    }
    
    private boolean isSmall(int[] wallet, int[] bill) {
        boolean billIsSmall = false;
        if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
            billIsSmall = true;
        } else if (wallet[0] >= bill[1] && wallet[1] >= bill[0]) {
            billIsSmall = true;
        }
        return billIsSmall;
    }
    
    private int[] slip(int[] bill) {
        if (bill[0] > bill[1]) {
            bill[0] = bill[0] / 2;
        } else {
            bill[1] = bill[1] / 2;
        }
        return bill;
    }
}