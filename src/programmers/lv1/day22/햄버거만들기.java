package programmers.lv1.day22;

import java.util.Stack;

public class 햄버거만들기 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> burger = new Stack<>();
        for(int in : ingredient) {
            burger.push(in);
            //스택 사이즈 4이상일 경우부터
            if(burger.size()>=4) {
                int a = burger.pop();
                int b = burger.pop();
                int c = burger.pop();
                int d = burger.pop();

                if(a == 1 && b ==3 && c==2 && d==1) {
                    answer++;
                }else {
                    burger.push(d);
                    burger.push(c);
                    burger.push(b);
                    burger.push(a);

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(arr));
    }

}
