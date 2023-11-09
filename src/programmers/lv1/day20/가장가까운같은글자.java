package programmers.lv1.day20;

import java.util.HashMap;

public class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                answer[i] = -1;
                map.put(s.charAt(i),i);
            } else {
                //현재 자신의 인덱스 위치에서 전 인덱스를 빼줘야함
                //인덱스를 갖고와야함
                answer[i] = i- map.get(s.charAt(i));
                map.put(s.charAt(i),i);

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        가장가까운같은글자 s = new 가장가까운같은글자();
        for (int i : s.solution("banana")) {
            System.out.print(i + " ");
        }
    }
}
