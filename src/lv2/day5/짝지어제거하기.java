package lv2.day5;

import java.util.Stack;

public class 짝지어제거하기 {
    public static int solution(String s)
    {
        int answer = 1;
        char[] schar = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<schar.length;i++) {
            if (stack.empty()) {
                stack.push(schar[i]);
                continue;
            }
            if (stack.peek() == schar[i]) {
                stack.pop();
            }else {
                stack.push(schar[i]);
            }
        }
        if (stack.size() != 0){
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution("baabaa"));
    }
}
