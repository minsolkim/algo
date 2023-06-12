package lv1.day11;

import java.util.Arrays;

public class 체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n- lost.length; //여벌의 체육복을 가진 학생이 도난 당했을 경우
        for(int i=0; i< lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        } //여벌의 체육복을 가진 사람이 자신것도 잃어버릴 경우
        for(int i=0; i <lost.length;i++){
            for (int j=0;j<reserve.length;j++){
                if(lost[i] == reserve[j] +1 || lost[i] == reserve[j] -1)
                {
                    answer++;
                    reserve[j] = -1;
                    break;

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] lost1 = {2, 4};
        int[] reserve1 = {1, 3, 5};
        System.out.println(solution(5, lost1, reserve1)); // 5
    }

}
