package medium;

// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {

  public static void main(String[] args){
    System.out.println(Arrays.toString(topKFrequent(new int[]{3, 2, 2, 1, 1, 1}, 2)));
    System.out.println(Arrays.toString(topKFrequent(new int[]{1}, 1)));
    System.out.println(Arrays.toString(topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2)));
  }

  public static int[] topKFrequent(int[] nums, int k) {

    int[] topK = new int[k];

    List<Integer> numsList = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      numsList.add(nums[i]);
    }

    List<Integer> distinctNums = numsList.stream().distinct().collect(Collectors.toList());
    Map<Integer, Integer> map = new TreeMap<>();
    for (Integer num: distinctNums) {
      int count = 0;
      for (int j = 0; j < numsList.size(); j++) {
        if (Objects.equals(num, numsList.get(j))) {
          count++;
        }
      }
      map.put(num, count);
    }
    Map<Integer, Integer> finalMap = map.entrySet()
        .stream()
      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(
          Map.Entry::getKey,
          Map.Entry::getValue,
          (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    for (int i = 0, j = 0; i < k; i++, j++) {
      Integer key = finalMap.keySet().stream().findFirst().get();
        topK[i] = key;
        finalMap.remove(key);
      }

    return topK;
  }
}
