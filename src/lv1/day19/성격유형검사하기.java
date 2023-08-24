package lv1.day19;

import java.util.HashMap;

public class 성격유형검사하기 {
    static String[] types = {"RT","CF","JM","AN"};
    public static String typeCheck(HashMap<Character,Integer> map) {
        StringBuilder sb = new StringBuilder();
        char leftvalue;
        char rightvalue;
        for(String s : types){
            leftvalue = s.charAt(0);
            rightvalue = s.charAt(1);
            if(map.get(leftvalue) >= map.get(rightvalue)) {
                sb.append(leftvalue);
            }else if(map.get(leftvalue) < map.get(rightvalue)) {
                sb.append(rightvalue);
            }
        }
        return sb.toString();
    }
    public static String solution(String[] survey, int[] choices) {
        int []score = {0,3,2,1,0,-1,-2,-3};
        int scoreSum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        //점수기록 기본값으로 초기화
        for (String type : types){
            map.put(type.charAt(0),0);
            map.put(type.charAt(1),0);
        }
        //설문을 돌린다.
        int n = survey.length;
        for(int i=0;i<n;i++) {
            //기본값에 점수를 더해준다.
            scoreSum = map.get(survey[i].charAt(0))+score[choices[i]];
            map.put(survey[i].charAt(0),scoreSum);
        }

        String answer =typeCheck(map);
        return answer;
    }

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        System.out.println(solution(survey, choices));
    }
}
