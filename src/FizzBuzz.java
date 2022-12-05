// 05/12/2022
// https://leetcode.com/problems/fizz-buzz/

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("5 = " + fizzBuzz(100));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> fizzBuzz = new ArrayList<>();

        for (int i = 1; i < n+1; i++) {
            if (i%3 == 0 && i%5 == 0) {
                fizzBuzz.add("FizzBuzz");
            } else if (i%3 == 0){
                fizzBuzz.add("Fizz");
            } else if (i%5 == 0) {
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(String.valueOf(i));
            }
        }
        return fizzBuzz;
    }
}
