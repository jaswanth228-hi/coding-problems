class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int money : customer) {
                currentWealth += money;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }
}
