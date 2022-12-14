package easy;// 08/12/2022
// https://leetcode.com/problems/first-unique-character-in-a-string/

public class FirstUniqueCharacter {
  public static void main(String[] args){
  /* System.out.println("leetcode =" + firstUniqChar("leetcode"));
    System.out.println("loveleetcode =" + firstUniqChar("loveleetcode"));
    System.out.println("aabb =" + firstUniqChar("aabb"));*/
    System.out.println("aabb =" + firstUniqChar("z"));
    System.out.println("dddccdbba =" + firstUniqChar("dddccdbba"));
  }

  public static int firstUniqChar(String s) {

    char[] chars = s.toCharArray();

    if (chars.length == 1) return 0;

    for (int i = 0; i < s.length(); i++) {
      boolean isUnique = true;
      for (int j = 0; j < s.length(); j++) {
        if (i != j) {
          if (chars[i] == chars[j]) {
            isUnique = false;
            break;
          }
        }
      }
      if (isUnique) {
        return i;
      }
    }
    return -1;
  }
}
