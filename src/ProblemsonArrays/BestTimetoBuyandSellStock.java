package ProblemsonArrays;

public class BestTimetoBuyandSellStock {
    private static int maxProfit(int[] prices) {
        int maxProfit = 0;

        return maxProfit;
    }
    private static int maxProfit1(int[] prices){
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPrice = Math.max(maxPrice, prices[i] - minPrice);
        }
        return maxPrice;
    }
}
