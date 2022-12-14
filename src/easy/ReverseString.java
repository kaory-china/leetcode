package easy;// 29/11/2022
// https://leetcode.com/problems/reverse-string/

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a','h'});
    }

    public static void reverseString(char[] s) {

        int i = 0;
        int y = 1;
        while (i < s.length/2) {
            char temp = s[i];
            s[i] = s[s.length-y];
            s[s.length-y] = temp;
            i++;
            y++;
        }
        System.out.println(Arrays.toString(s));
    }
}
