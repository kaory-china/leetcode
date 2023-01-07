package sorting;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args){
    int[] nums = new int[]{90, 0, 70, 60, -100, -1, 30, 20, 10};
    quickSort(nums, 0, nums.length-1);
    System.out.println(Arrays.toString(nums));
  }

  public static void quickSort(int[] nums, int lowerBound, int upperBound) {

    if (lowerBound < upperBound) {
      int smallestElementIndex = partition(nums, lowerBound, upperBound);
      quickSort(nums, lowerBound,smallestElementIndex-1);
      quickSort(nums,smallestElementIndex+1, upperBound);
    }

  }

  private static int partition(int[] nums, int lowerBound, int upperBound) {

    int pivot = nums[upperBound];
    int nextToSwap = lowerBound;

    for (int i = lowerBound; i < upperBound; i++) {
      if (nums[i] < pivot) {
        swap(nums, i, nextToSwap);
        nextToSwap++;
      }
    }
    swap(nums, upperBound, nextToSwap);

    return nextToSwap;
  }

  private static void swap(int[] nums, int firstIndex, int secondIndex) {
    int temp = nums[firstIndex];
    nums[firstIndex] = nums[secondIndex];
    nums[secondIndex] = temp;
  }

}
