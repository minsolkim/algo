package lv1.day13;

import java.util.HashMap;

public class 추억점수 {
    public  int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<name.length;i++){
            map.put(name[i],yearning[i]);
        }
        for (int i=0;i<photo.length;i++){
            String[] person = photo[i];
            int score = 0;
            for(int j=0;j< person.length;j++){
                String personname = person[j];
                if(map.containsKey(personname)){
                    score += map.get(personname);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
