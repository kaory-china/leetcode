package blind75.arrays;

public class BestTimeToBuyAndSellStock {

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    System.out.println(maxProfit(new int[]{7,6,4,3,1}));
  }

  public static int maxProfit(int[] prices) {
    int minValue = prices[0];
    int minIndex = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minValue) {
        minValue = prices[i];
        minIndex = i;
      }
    }

    if (minIndex == prices.length-1) return 0;

    int maxValue = prices[minIndex + 1];

    for (int j = minIndex + 1;  j < prices.length; j++) {
      if (prices[j] > maxValue) {
        maxValue = prices[j];
      }
    }

    if (maxValue - minValue < 0) {
      return 0;
    }

    return maxValue - minValue;
  }

}
