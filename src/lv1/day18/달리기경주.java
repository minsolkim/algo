package lv1.day18;

import java.util.Arrays;
import java.util.HashMap;

public class 달리기경주 {
    public static String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i< players.length;i++){
            map.put(players[i],i);
        }
        for(String name : callings) {
            int index = map.get(name);
            String front = players[index-1];
            //현재 자신의 등수 앞으로 교환
            map.put(players[index],index-1);
            //원래 그 등수 였던 사람은 뒤에 등수로 교환
            map.put(players[index -1],map.get(front)+1);
            players[index] = front;
            map.put(front,index);

        }
        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(players, callings)));
    }
}
