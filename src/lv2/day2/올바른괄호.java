package lv2.day2;

import java.util.Stack;

public class 올바른괄호 {

    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        //괄호를 나눈다.
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) =='('){
                stack.push('(');
            }else if (s.charAt(i)==')'){
                if (stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }

            }
        }
        return stack.isEmpty();
    }
}
