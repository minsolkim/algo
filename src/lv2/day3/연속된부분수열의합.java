package lv2.day3;

import java.util.ArrayList;

public class 연속된부분수열의합 {
    public static int[] solution(int[] sequence, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        int[] answer = new int[2];
        while (end < sequence.length && start <= end){
            //처음 시작할때
            if (start == end){
                sum = sequence[start];
            }
            //누적합이 k와 같을 때
            if (sum == k) {
                //전에 있던 부분수열의 길이가 더 긴경우
                if (len > end - start +1) {
                    //길이가 짧은 수열로 길이를 변경
                    len = end - start +1;
                    answer[0] = start;
                    answer[1] = end;
                }
                sum -= sequence[start];
                if (end+1 < sequence.length) {
                    sum += sequence[end+1];
                }
                //길이가 제일 짧을경우
                if (start == end) {
                    //while문을 벗어난다. 
                    break;
                }
                start++;
                end++;

            }else if(sum >k) {
                sum-= sequence[start];
                start++;
            }else if(sum <k) {
                if (end+1<sequence.length) {
                    sum += sequence[end+1];
                }
                end++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] sequence = {1,1,1,2,3,4,5};
        int k = 5;
        System.out.print(solution(sequence,k));
    }
}
