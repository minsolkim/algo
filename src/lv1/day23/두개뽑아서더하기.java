package lv1.day23;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j< numbers.length;j++) {
                int a = numbers[i] + numbers[j];
                if (list.indexOf(a) <0) {
                    list.add(a);
                }
            }
        }
        int[] answer = new int[list.size()] ;
        for (int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
