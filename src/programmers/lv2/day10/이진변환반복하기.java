package programmers.lv2.day10;

import java.util.Arrays;

public class 이진변환반복하기 {
    public static int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCount =0;

        while(!s.equals("1")) {

            //0이 제거된 문자열
            int removes = s.replaceAll("0","").length();
            zeroCount += s.length() - removes;
            //이진수로 변환
            s = Integer.toBinaryString(removes);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = zeroCount;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
        System.out.println(Arrays.toString(solution("01110")));
        System.out.println(Arrays.toString(solution("1111111")));

    }
}
