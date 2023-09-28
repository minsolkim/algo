package lv2.day12;

import java.util.HashMap;

public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        for (String phone : phone_book) {
            map.put(phone,1);  //119,119333
        }
        for (String phone : phone_book) {
            for (int i=1;i<phone.length();i++) {
                String a = phone.substring(0,i);
                if (map.containsKey(a))
                    return false;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.print(solution(new String[] {"119", "97674223", "1195524421"}));
    }
}
