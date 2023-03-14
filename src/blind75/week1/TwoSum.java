package blind75.arrays;

import java.util.Arrays;

public class TwoSum {

  public static void main(String[] args) {

    int[] caseOne = new int[]{2, 7, 11, 15};
    int[] caseTwo = new int[]{3, 2, 4};
    int[] caseThree = new int[]{3, 3};

    System.out.println(Arrays.toString(twoSum(caseOne, 9)));
    System.out.println(Arrays.toString(twoSum(caseTwo, 6)));
    System.out.println(Arrays.toString(twoSum(caseThree, 6)));
  }

  public static int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[2];
  }

}