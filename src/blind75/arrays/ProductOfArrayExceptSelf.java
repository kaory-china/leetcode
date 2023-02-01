package blind75.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
  }

  public static int[] productExceptSelf(int[] nums) {
    int[] answer = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int product = 1;
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          product *= nums[j];
        }
        if (product == 0) {
          break;
        }
      }
      answer[i] = product;
    }
    return answer;
  }
}
