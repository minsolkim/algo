package programmers.lv2.day1;

import java.util.HashMap;

public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> dcmap = new HashMap<>();
        int day =10;
        for (int i=0;i<want.length;i++) {
            map.put(want[i],number[i]);
        }
        //discount 항목 수량 체크
        for (int j=0;j<10;j++){
            dcmap.put(discount[j],dcmap.getOrDefault(discount[j],0)+1);
        }
        if (isEqual(map,dcmap)){
            answer++;
        }
        for (int i=1;i<=discount.length-10;i++) {
            String remove = discount[i-1];
            dcmap.put(remove,dcmap.get(remove) -1);

            String add = discount[i-1+10];
            dcmap.put(add,dcmap.getOrDefault(add,0)+1);
            if (isEqual(map,dcmap)) {
                answer++;
            }

        }
        return answer;
    }
    public boolean isEqual(HashMap<String,Integer> map,HashMap<String,Integer> dcmap){
        for (String key : map.keySet()) {
            if (!dcmap.containsKey(key) ||map.get(key) != dcmap.get(key))
                return false;
        }
        return true;
    }

}
