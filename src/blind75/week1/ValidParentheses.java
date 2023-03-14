package easy;// 22/11/2022
// https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println("Testando {[]} = " + isValid("{[]}"));
        System.out.println("Testando () = " + isValid("()"));
        System.out.println("Testando ()[]{} = " + isValid("()[]{}"));
        System.out.println("Testando (] = " + isValid("(]"));
        System.out.println("Testando ()]{ = " + isValid("()]{"));
        System.out.println("Testando ()[]{} = " + isValid("()[]{}"));

    }

    public static boolean isValid(String s) {
        Stack stack = new Stack();

        char[] givenChars = s.toCharArray();

        if (givenChars.length % 2 != 0) return false;

        for (int contador = 0; contador < givenChars.length; contador++) {
            if (isOpeningChar(givenChars[contador])) {
                stack.push(givenChars[contador]);
            } else {
                if (stack.empty()) {
                    return false;
                }
                switch (givenChars[contador]) {
                    case ')':
                        if (!stack.pop().equals('(')) {
                            return false;
                        }
                        break;
                    case ']':
                        if (!stack.pop().equals('[')) {
                            return false;
                        }
                        break;
                    case '}':
                        if (!stack.pop().equals('{')) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return stack.empty();
    }

    public static boolean isOpeningChar(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

}
