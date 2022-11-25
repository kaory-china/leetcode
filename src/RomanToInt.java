// 17/11/2022
// https://leetcode.com/problems/roman-to-integer/

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String x) {
        int romanInt = 0;
        int contadorUnidades = 0;

        char[] romanChars = x.toCharArray();
        System.out.println(romanChars);

        for (int index = romanChars.length - 1; index >= 0; index--) {
            switch (romanChars[index]) {
                case 'I':
                    if (contadorUnidades <= 3) {
                        romanInt++;
                        contadorUnidades++;
                    }
                    break;
                case 'V':
                    if (index - 1 < 0) {
                        romanInt = romanInt + 5;
                        break;
                    }
                    if (romanChars[index - 1] == 'I') {
                        romanInt = romanInt + 4;
                        index--;
                    } else {
                        romanInt = romanInt + 5;
                    }
                    break;
                case 'X':
                    if (index - 1 < 0) {
                        romanInt = romanInt + 10;
                        break;
                    }
                    if (romanChars[index - 1] == 'I') {
                        romanInt = romanInt + 9;
                        index--;
                    } else {
                        romanInt = romanInt + 10;
                    }
                    break;
                case 'L':
                    if (index - 1 < 0) {
                        romanInt = romanInt + 50;
                        break;
                    }
                    if (romanChars[index - 1] == 'X') {
                        romanInt = romanInt + 40;
                        index--;
                    } else {
                        romanInt = romanInt + 50;
                    }
                    break;
                case 'C':
                    if (index - 1 < 0) {
                        romanInt = romanInt + 100;
                        break;
                    }
                    if (romanChars[index - 1] == 'X') {
                        romanInt = romanInt + 90;
                        index--;
                    } else {
                        romanInt = romanInt + 100;
                    }
                    break;
                case 'D':
                    if (index - 1 < 0) {
                        romanInt = romanInt + 500;
                        break;
                    }
                    if (romanChars[index - 1] == 'C') {
                        romanInt = romanInt + 400;
                        index--;
                    } else {
                        romanInt = romanInt + 500;
                    }
                    break;
                case 'M':
                    if (index - 1 < 0) {
                        romanInt = romanInt + 1000;
                        break;
                    }
                    if (romanChars[index - 1] == 'C') {
                        romanInt = romanInt + 900;
                        index--;
                    } else {
                        romanInt = romanInt + 1000;
                    }
                    break;
            }
        }
        return romanInt;
    }

    /*Runtime: 6 ms, faster than 89.85% of Java online submissions for Roman to Integer.
    Memory Usage: 45.3 MB, less than 58.03% of Java online submissions for Roman to Integer.*/

}
