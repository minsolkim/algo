package programmers.lv2.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 오픈채팅방 {
    public static String[] solution(String[] record) {
        //해당아이디에 닉네임 저장
        HashMap<String,String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i< record.length;i++){
            String arr[] = record[i].split(" ");
            if (arr.length > 2) {
                map.put(arr[1], arr[2]);
            }
        }
        for (int i=0;i< record.length;i++) {
            String arr[] = record[i].split(" ");
            if(arr[0].equals("Enter")) {
                list.add(map.get(arr[1]) +"님이 들어왔습니다.");
            }else if (arr[0].equals("Leave")) {
                list.add(map.get(arr[1]) +"님이 나갔습니다.");
            }
        }
        String result[] = new String[list.size()];
        list.toArray(result);
        //String[] answer = {};
        return result;
    }
    public static void main(String[] args) {
        String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
                "Change uid4567 Ryan" };
        System.out.println(Arrays.toString(solution(record)));
    }
}
