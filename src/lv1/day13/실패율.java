package lv1.day13;

import java.util.HashMap;

public class 실패율 {
    public static int[] solution(int N, int[] stages) {
        HashMap<Integer,Double> map = new HashMap<>();
        for(int i=1;i<=N;i++){
            double total = 0;
            double fail = 0;
            for(int j=0;j<stages.length;j++){
                //i보다 작으면 이미 i보다 작은단계에 머물러있으므로 실패율구할때의 total에 포함을 안해도된다.
                if(i <= stages[j]) total++;
                if(i == stages[j]) fail++;
            }
            if(total ==0 && fail==0) total =1;
            map.put(i,fail/total);
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            double max = -1;
            int rKey = 0;
            for (int key : map.keySet()){
                if(max < map.get(key)){
                    max = map.get(key);
                    rKey = key;
                }
            }
            answer[i] = rKey;
            map.remove(rKey);
        }

        return answer;
    }

    public static void main(String[] args) {
        int N =5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.print(solution(N,stages));
    }

}
