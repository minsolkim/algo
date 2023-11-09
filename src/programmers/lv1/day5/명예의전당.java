package programmers.lv1.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 명예의전당 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i< score.length;i++) {
            if(list.size() < k) { //그대로 들어감
                list.add(score[i]);
            } else {
                if(list.get(0)<score[i]){
                    list.remove(0);
                    list.add(score[i]);

                }
                Collections.sort(list);
            }

            answer[i] = list.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[] {10, 100, 20, 150, 1, 100, 200}))); // [10, 10, 10, 20, 20, 100, 100]

    }
}
