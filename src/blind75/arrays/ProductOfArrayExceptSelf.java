package blind75.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
  }

  public static int[] productExceptSelf(int[] nums) {
    int[] answer = new int[nums.length];

    int[] preffixes = new int[nums.length];
    int[] suffixes = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        preffixes[0] = 1;
      } else {
        preffixes[i] = preffixes[i - 1] * nums[i - 1];
      }
    }
    for (int i = nums.length - 1; i >= 0; i--) {
      if (i == nums.length - 1) {
        suffixes[nums.length - 1] = 1;
      } else {
        suffixes[i] = suffixes[i + 1] * nums[i + 1];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      answer[i] = preffixes[i] * suffixes[i];
    }

    return answer;
  }
}
