package lv2.day10;

import java.util.HashMap;

public class 의상 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap();
        for (int i=0;i<clothes.length;i++) {
            String type = clothes[i][1];
            map.put(type,map.getOrDefault(type,0)+1);
        }
        for (int amount : map.values()) {
            answer *= (amount+1);
        }

        return answer-1;
    }
}
