// 04/12/2022
// https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;

public class ContainsDuplicate {

  public static void main(String[] args){
    System.out.println("1,2,3,1" + containsDuplicate2(new int[]{1,2,3,1}));
    System.out.println("1,2,3,4" + containsDuplicate(new int[]{1,2,3,4}));
    System.out.println("1,1,1,3,3,4,3,2,4,2" + containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));

  }

  // time out
  public static boolean containsDuplicate(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = nums.length-1; j >= 0; j--) {
        if (i != j) {
          if (nums[i] == nums[j]) return true;
        }
      }
    }
    return false;
  }

  public static boolean containsDuplicate2(int[] nums) {
    int[] newNums = Arrays.stream(nums).sorted().toArray();
    for (int i = 0; i < newNums.length-1; i++) {
      if (newNums[i] == newNums[i+1]) return true;
    }

    return false;
  }

}
