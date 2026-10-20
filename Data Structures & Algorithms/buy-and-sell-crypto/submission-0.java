class Solution {
    public int maxProfit(int[] prices) {

        int[][] matrix = new int[prices.length][prices.length]; 
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                matrix[i][j] = prices[j] - prices[i];
            }
        }
        int max = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                max = Math.max(matrix[i][j], max);
            }
        }
        return max;
    }
}
