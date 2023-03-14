package blind75.week1;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    System.out.println(isPalindrome("race a car"));
    System.out.println(isPalindrome(" "));

  }

  public static boolean isPalindrome(String s) {

    List<Character> finalArray = new ArrayList<>();
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c) || Character.isLetter(c)) {
        if (Character.isLetter(c)) {
          finalArray.add(Character.toLowerCase(c));
        } else {
          finalArray.add(c);
        }
      }
    }

    int i = 0;
    int j = finalArray.size() - 1;
    while (i <= j) {
      if (finalArray.get(i) != finalArray.get(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
