package lv1.day12;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
        Map<String,Integer> map = new HashMap<>();
        String answer = "";
        //해쉬맵에 참가자 명단 넣기
        for(int i=0;i<participant.length;i++){
            if(map.get(participant[i])==null){
                map.put(participant[i],1);
                continue;
            }
            //동명이인이 있을경우
            map.put(participant[i],map.get(participant[i])+1);
        }
        for(String c: completion) {
            map.put(c,map.get(c)-1); //0으로 만든다.
        }
        for(int i=0;i<participant.length;i++){
            if(map.get(participant[i])>=1){
                answer=participant[i];
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        System.out.print(solution(participant,completion));
    }
}
