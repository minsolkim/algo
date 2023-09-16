package lv2.day8;

import java.util.Stack;

public class 괄호회전하기 {
    public static int solution(String s) {
        StringBuilder sb;
        int answer = 0;
        for(int i=0;i<s.length();i++) {
            sb = new StringBuilder();
            sb.append(s.substring(i));
            sb.append(s.substring(0,i));
            Stack<Character> stack = new Stack<>();
            for (int j=0;j<sb.length();j++) {
                char c = sb.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(c);
                }else if(c==')' && stack.peek() == '('){
                    stack.pop();
                }else if (c =='}' && stack.peek() =='{'){
                    stack.pop();
                }else if (c==']' && stack.peek() == '[') {
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.print(solution("[](){}"));
    }
}
