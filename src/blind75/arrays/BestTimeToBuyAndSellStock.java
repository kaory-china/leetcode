package blind75.arrays;

public class BestTimeToBuyAndSellStock {

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    System.out.println(maxProfit(new int[]{2, 4, 1}));
  }

  public static int maxProfit(int[] prices) {
    int maxProfit = 0;

    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[j] > prices[i]) {
          if (prices[j] - prices[i] > maxProfit) {
            maxProfit = prices[j] - prices[i];
          }
        }
      }
    }

    return maxProfit;
  }
}
