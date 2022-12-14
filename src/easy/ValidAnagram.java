package easy;// 06/12/2022
// https://leetcode.com/problems/valid-anagram/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ValidAnagram {

  public static void main(String[] args){
    System.out.println("1 = " + isAnagram("anagram", "nagaram"));
    System.out.println("2 = " + isAnagram("rat", "car"));
    System.out.println("3 = " + isAnagram("a", "ab"));
  }

  public static boolean isAnagram(String s, String t) {

    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();

    List<Character> sCharsList = new ArrayList<>();
    for (int i = 0; i < sChars.length; i++) {
      sCharsList.add(sChars[i]);
    }
    sCharsList.sort(Comparator.naturalOrder());

    List<Character> tCharsList = new ArrayList<>();
    for (int i = 0; i < tChars.length; i++) {
      tCharsList.add(tChars[i]);
    }
    tCharsList.sort(Comparator.naturalOrder());

    return sCharsList.equals(tCharsList);
  }

}
