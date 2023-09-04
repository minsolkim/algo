package lv2.day4;

import java.util.HashMap;

public class 영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0;i< words.length;i++) {
            if (i!=0) {
                //이전단어
                //현재단어
                String ago = words[i - 1];
                String ing = words[i];
                char lastIndex = ago.charAt(ago.length() - 1);
                char firstIndex = ing.charAt(0);
                if (map.containsKey(ing) || lastIndex != firstIndex) {
                    answer[0] = (i % n) + 1;//번호
                    answer[1] = (i / n) + 1;//차례
                    return answer;
                }
            }
            map.put(words[i],1);

        }
        return answer;
    }
}

