package programmers.lv2.day2;

import java.util.Stack;

public class 뒤에있는큰수찾기 {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        for (int i= numbers.length-1;i>=0;i--) {
            while (!stack.isEmpty()) {
                int num = stack.peek();
                //뒤에있는 수가 크다면
                if (num>numbers[i]){
                    answer[i] = num;
                    break;
                }else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()){
                answer[i] =-1;
            }

            stack.push(numbers[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,3,5};
        System.out.print(solution(numbers));
    }
}
