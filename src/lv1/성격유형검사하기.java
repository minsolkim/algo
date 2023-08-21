package lv1;

import java.util.HashMap;

public class 성격유형검사하기 {
    static String[] type = {"RT","CF","JM","AN"};
    public static String typeCheck(HashMap<Character,Integer> map) {
        StringBuilder sb = new StringBuilder();
        char firstchar;
        char secondchar;
        char typechar;
        for(String s : type){
            firstchar = s.charAt(0);
            secondchar = s.charAt(1);

            typechar = map.get(firstchar) >= map.get(secondchar) ? firstchar : secondchar;
            sb.append(typechar);
        }
        return sb.toString();
    }
    public static String solution(String[] survey, int[] choices) {
        int []score = {0,3,2,1,0,-1,-2,-3};
        int scoreSum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : type){
            map.put(s.charAt(0),0);
            map.put(s.charAt(1),0);
        }
        for(int i=0;i<survey.length;i++) {
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
