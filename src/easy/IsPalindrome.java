package easy;// 16/11/2022
// https://leetcode.com/problems/palindrome-number/

public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println("TestCase: 10 = " + isPalindrome(10));
        System.out.println("TestCase: 121 = " + isPalindrome(121));
        System.out.println("TestCase: -121 = " + isPalindrome(-121));
        System.out.println("TestCase: 1122 = " + isPalindrome(1122));
    }

    public static boolean isPalindrome(int x) {

        char[] chars = String.valueOf(x).toCharArray();
        int beg = 0;
        int end = chars.length-1;
        int ref;

        if (x < 0) return false;

        if (chars.length == 2) {
            if (chars[0] != chars[1]) {
                return false;
            } else {
                return true;
            }
        }

        if (chars.length % 2 == 0) {

            ref = chars.length/2;

            while (beg < ref+1 && end > ref-1) {
                if (chars[beg] == chars[end]) {
                    beg++;
                    end--;
                } else {
                    return false;
                }
            }
        } else {
            ref = chars.length/2 + 1;

            while (beg < ref) {
                if (chars[beg] == chars[end]) {
                    beg++;
                    end--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
