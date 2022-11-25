// 21/11/2022 (compensando por 19/11/2022)
// https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] testeUm = new String[]{"flower", "flow", "flight"};
        String[] testeDois = new String[]{"dog", "racecar", "car", ""};
        String[] testeTres = new String[]{"d"};
        String[] testeQuatro = new String[]{"ab", "a"};
        String[] testeCinco = new String[]{"", ""};
        String[] testeSeis = new String[]{""};
        String[] testeSete = new String[]{"reflower", "flow", "flight"};
        System.out.println("Longest Common Prefix = " + longestCommonPrefix(testeUm));
        System.out.println("Longest Common Prefix = " + longestCommonPrefix(testeDois));
        System.out.println("Longest Common Prefix = " + longestCommonPrefix(testeTres));
        System.out.println("Longest Common Prefix = " + longestCommonPrefix(testeQuatro));
        System.out.println("Longest Common Prefix = " + longestCommonPrefix(testeCinco));
        System.out.println("Longest Common Prefix = " + longestCommonPrefix(testeSeis));
        System.out.println("Longest Common Prefix = " + longestCommonPrefix(testeSete));
    }

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs, Comparator.comparingInt(String::length));
        String longestCommonPrefix = "";

        if (strs.length == 1 || strs[0].equals("")) return strs[0];

        int charAt = 0;
        for(char letter: strs[0].toCharArray()) {
            int contador = 0;
            while (contador < strs.length - 1) {
                if (letter == strs[contador + 1].charAt(charAt)) {
                    contador++;
                } else {
                    return longestCommonPrefix;
                }
            }
            longestCommonPrefix = longestCommonPrefix.concat(String.valueOf(letter));
            charAt++;
        }

        return longestCommonPrefix;
    }
}
