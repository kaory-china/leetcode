// 24/11/2022
// https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println("Hello World = " + lengthOfLastWord("Hello World"));
        System.out.println("   fly me   to   the moon  = " + lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("luffy is still joyboy = " + lengthOfLastWord("luffy is still joyboy"));

    }

    public static int lengthOfLastWord(String s) {

        String[] words = s.split(" ");

        return words[words.length-1].length();

    }

}
