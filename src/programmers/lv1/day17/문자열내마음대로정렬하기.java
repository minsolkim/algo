package programmers.lv1.day17;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {
    public static String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();
        String[] answer = new String[strings.length];
        for(int i=0;i< strings.length;i++) {
            list.add(strings[i].charAt(n) +strings[i]);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++) {
            //문자열 첫번째부터 쭉 나열
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
