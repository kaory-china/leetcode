package easy;// 28/11/2022
// https://leetcode.com/problems/plus-one/

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println("[1,2,3] = " + Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println("[4,3,2,1] = " + Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println("[9] = " + Arrays.toString(plusOne(new int[]{9})));
        System.out.println("[9,8,7,6,5,4,3,2,1,0] = " + Arrays.toString(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
        System.out.println("[7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6] = " + Arrays.toString(plusOne(new int[]{7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1, 1, 7, 4, 0, 0, 6})));
        System.out.println("[9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9] = " + Arrays.toString(plusOne(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int[] newArray = new int[digits.length];

        try {
            String number = "";

            for (int num : digits) {
                number = number.concat(String.valueOf(num));
            }

            String longNumber = String.valueOf(Long.parseLong(number) + 1L);

            char[] charArray = longNumber.toCharArray();

            newArray = new int[charArray.length];

            for (int i = 0; i < charArray.length; i++) {
                newArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
            }
        } catch (NumberFormatException e) {

            if (digits[digits.length - 1] < 9) {
                digits[digits.length - 1] = digits[digits.length - 1] + 1;
                for (int j = 0; j < digits.length; j++) {
                    newArray[j] = digits[j];
                }
            } else {
                int i = digits.length - 1;
                while (digits[i] == 9 && i > 0) {
                    digits[i] = 0;
                    i--;
                }
                if (i > 0) {
                    digits[i] = digits[i] + 1;
                    for (int j = 0; j < digits.length; j++) {
                        newArray[j] = digits[j];
                    }
                } else {
                    newArray = new int[digits.length + 1];
                    newArray[0] = 1;
                    for (int j = 1; j < digits.length; j++) {
                        newArray[j] = digits[j];
                    }
                }
            }
        }
        return newArray;
    }
}
