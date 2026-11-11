class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        
        for (int i = 0; i < m; i++) {
            int rMin = matrix[i][0];
            int colIdx = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < rMin) {
                    rMin = matrix[i][j];
                    colIdx = j;
                }
            }
            
            boolean isLucky = true;
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIdx] > rMin) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) result.add(rMin);
        }
        return result;
    }
}
