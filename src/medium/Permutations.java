package medium;// 07/12/2022
// https://leetcode.com/problems/permutations/

import java.util.ArrayList;
import java.util.List;

public class Permutations {
  public static void main(String[] args){
    System.out.println(permute(new int[]{1, 2, 3}));
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> permutations = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      List<Integer> permutation = new ArrayList<>();
      permutation.add(nums[i]);
      for (int j = 0; j < nums.length; j++) {
        if (i != j)
        permutation.add(nums[j]);
      }
      permutations.add(permutation);
    }

    return permutations;
  }
}
