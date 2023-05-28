package lv1.day1;

import java.util.ArrayList;
import java.util.Stack;

public class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> result = new Stack<>();
        int pointer = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char dart = dartResult.charAt(i);
            //숫자일경우 바로 수행문을 수행하지 않고 다시 조건문으로 넘어감
            if(Character.isDigit(dart))
                continue;

            String str = dartResult.substring(pointer, i);
            int num = !str.isBlank()?Integer.parseInt(str):0;
            switch (dart) {
                case 'S':
                    break;
                case 'D':
                    num = num*num;
                    break;
                case 'T':
                    num = num*num*num;
                    break;
                case '*':
                    num = result.pop()*2;
                    if(!result.isEmpty())result.push(result.pop()*2);
                    break;
                case '#':
                    num = result.pop()*-1;
                    break;
            }
            pointer=i+1;
            result.push(num);

        }
        while(!result.isEmpty())
            answer+=result.pop();

        return answer;
    }
    public static void main(String[] args) {
        다트게임 test = new 다트게임();
        System.out.println(test.solution("1S2D*3T"));
    }
}
