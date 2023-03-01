package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

  public static void main(String[] args) {
    System.out.println(mergeSort(Arrays.asList(5, 9, 2, 4, 6, 0, 1)));
  }

  public static List<Integer> mergeSort(List<Integer> nums) {

    if (nums.size() == 0 || nums.size() == 1) return nums;

    int middleIndex = nums.size() / 2;

    List<Integer> unsortedLeftArray = nums.subList(0, middleIndex);
    List<Integer> unsortedRightArray = nums.subList(middleIndex, nums.size());

    List<Integer> leftArray = mergeSort(unsortedLeftArray);
    List<Integer> rightArray = mergeSort(unsortedRightArray);
    return merge(leftArray, rightArray);
  }

  public static List<Integer> merge(List<Integer> leftArray, List<Integer> rightArray) {

    List<Integer> sortedArray = new ArrayList<>();

    int i = 0;
    int j = 0;
    for (int k = 0; i <= leftArray.size() || j <= rightArray.size(); k++) {
      if (i == leftArray.size()) {
        sortedArray.addAll(rightArray.subList(j, rightArray.size()));
        break;
      }
      if (j == rightArray.size()) {
        sortedArray.addAll(leftArray.subList(i, leftArray.size()));
        break;
      }

      if (leftArray.get(i) < rightArray.get(j)) {
        sortedArray.add(leftArray.get(i));
        i++;
      } else {
        sortedArray.add(rightArray.get(j));
        j++;
      }

    }
    return sortedArray;
  }
}