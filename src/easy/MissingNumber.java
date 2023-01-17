package easy;
//https://leetcode.com/problems/missing-number/

import java.util.Arrays;

public class MissingNumber {

  public static void main(String[] args){
    System.out.println("Missing Number = " + missingNumber(new int[] {3, 1, 0}));
    System.out.println("Missing Number = " + missingNumber(new int[] {1, 0}));
  }

  public static int missingNumber(int[] nums) {
    int[] sorted = Arrays.stream(nums).sorted().toArray();

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i] != i) {
        return i;
      }
    }

    return sorted.length;
  }

  // method 1 by Kunal_Jain21
/*  public static int missingNumber(int[] nums){
    int[] temp = new int[nums.length+1];
    for(int i=0; i<nums.length; i++){
      temp[nums[i]] = 1;

    }

    for(int i=0; i<nums.length+1; i++){
      if(temp[i]==0)
        return i;
    }
    return -1;
  }*/

  // method 2 by Kunal_Jain21
/*  public static int missingNumber(int[] nums) {
    int n=nums.length;
    int sum = n*(n+1)/2;
    System.out.println(sum);

    for(int i=0; i<n; i++)
      sum -= nums[i];
    return sum;
  }*/


}