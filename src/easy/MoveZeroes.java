package easy;// 05/12/2022
// https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {
  public static void main(String[] args) {
    moveZeroes(new int[]{0, 1, 0, 3, 12});
    moveZeroes(new int[]{0});
    moveZeroes(new int[]{0, 0, 1});

  }

  public static void moveZeroes(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        int index = findNextNonZeroIndex(nums, i+1);
        if (index != -1) {
          nums[i] = nums[index];
          nums[index] = 0;
        }
      }
    }
  }

  private static int findNextNonZeroIndex(int[] nums, int initialIndex) {
    int index = -1;
    for (int i = initialIndex; i < nums.length; i ++) {
      if (nums[i] != 0) {
        index = i;
        return index;
      }
    }
    return index;
  }
}