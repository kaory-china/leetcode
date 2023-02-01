package blind75.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
  }

  public static int[] productExceptSelf(int[] nums) {
    int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int rightProduct = 1;
      int leftProduct = 1;

      for (int r = 0; r < i; r++) {
        rightProduct *= nums[r];
      }
      for (int l = i + 1; l < nums.length; l++) {
        leftProduct *= nums[l];
      }
      answer[i] = rightProduct * leftProduct;
    }

    return answer;
  }
}
