package programmers.lv1.day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 개인정보수집유효기간 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        //terms 를 split으로 나눈다음 map에 넣어준다.
        for(int i=0;i< terms.length;i++) {
            String[] term = terms[i].split(" ");
            map.put(term[0],Integer.parseInt(term[1]));
        }
        int date = getDate(today);
        for(int j=0;j<privacies.length;j++){
            String[] privacy = privacies[j].split(" ");
            String Date = privacy[0];
            String term = privacy[1];
            //Date + 유효기간 <= today  판단
            if(getDate(Date) + (map.get(term)*28) <= date ) {
                //유효기간이 오늘날짜보다 짧으므로 파기
                list.add(j+1);
            }
        }
        //오름차순 정렬
        Collections.sort(list);
        int index =0;
        int[] answer= new int[list.size()];
        for (int i: list) {
            answer[index++] = i;
        }

        return answer;

    }
    private int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year*28*12) + (month*28) + day;
    }
}
