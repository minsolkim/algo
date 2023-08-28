package lv1.day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(int j=0;j< terms.length;j++){
            String[] term = terms[j].split(" ");
            map.put(term[0],Integer.parseInt(term[1]));
        }
        int date = getDate(today);
        for(int i=0;i<privacies.length;i++) {
            String[] privacy = privacies[i].split(" ");
            String Date = privacy[0];
            String Term = privacy[1];
            //today보다 유효기간이 짧거나 같은지 체크
            if(getDate(privacy[0])+ (map.get(privacy[1]) *28) <= date) {
                list.add(i+1);
            }
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        int index = 0;
        for(int i: list) {
            answer[index++] =i;
        }
        return answer;
    }
    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month *28) + day;
    }
}
