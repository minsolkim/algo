package programmers.lv1.day20;
import java.util.ArrayList;

public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        ArrayList<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        char[] sk = skip.toCharArray();
        for(int i=0;i<=25;i++){
            list.add((char) ('a' +i));
        }
        for(Character temp : sk){
            list.remove(temp);
        }

        StringBuilder answer = new StringBuilder();
        //한개씩 분리
        for(Character ch : arr) {
            int idx = list.indexOf(ch);
            idx = (idx + index) % list.size();
            answer.append(list.get(idx));
        }

        return answer.toString();
    }


}
