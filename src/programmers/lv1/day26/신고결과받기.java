package programmers.lv1.day26;

import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        //신고결과 카운트
        HashMap<String,Integer> resultcount = new HashMap<>();
        //각 id를 담는다. 초기값은 0으로 설정
        for(String id : id_list) {
            HashSet<String> set = new HashSet<String>();
            //key: 각 유저 아이디  value : 신고한사람들 리스트
            map.put(id,set);
            resultcount.put(id,0);
        }
        //split으로 나눠 신고한 사람 신고받은 사람 나눔
        for(String r : report) {
            String[] s = r.split(" ");
            //신고한사람
            String attack = s[0];
            //신고받은 사람
            String defend = s[1];
            HashSet<String> reporter = map.get(s[1]);
            //신고한 사람
            reporter.add(s[0]);
            //신고받은 사람 :key, 신고한 사람 : value
            map.put(defend,reporter);
        }
        for (String data: map.keySet()) {
            HashSet<String> reporter = map.get(data);
            //신고한사람이 k이상 일경우
            if (reporter.size() >=k) {
                for (String user : reporter) {
                    //신고한 사람들에게 count 증가
                    int count = resultcount.get(user) +1;
                    //신고한사람에게 결과메일 발송
                    resultcount.put(user,count);
                }
            }
        }
        int i=0;
        int[] answer = new int[id_list.length];
        for (String data: id_list) {
            answer[i] = resultcount.get(data);
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        String [] test = {"muzi", "frodo", "apeach", "neo"};
        String [] test1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        solution( test , test1, 2 );
    }
}
