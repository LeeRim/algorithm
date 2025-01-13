class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
		int[] attackNum = new int[attacks[attacks.length - 1][0] + 1];
		for (int[] attack : attacks) {
			attackNum[attack[0]] = attack[1];
		}

		int healthNum = health;
		int successCount = 0;
		for (int i = 1; i < attackNum.length; i++) {
			// 공격x
			if (attackNum[i] == 0) {
				successCount++;
				healthNum += bandage[1];
				// 연속 공격 성공
				if (successCount == bandage[0]) {
					healthNum += bandage[2];
					successCount = 0;
				}
				if (healthNum > health) {
					healthNum = health;
				}
			} else {
				// 공격o
				successCount = 0;
				healthNum -= attackNum[i];
				if (healthNum <= 0) {
					healthNum = -1;
					break;
				}
			}
		}

		int answer = healthNum;
		return answer;
	}
}