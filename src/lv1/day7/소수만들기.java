package lv1.day7;

import java.util.ArrayList;

public class 소수만들기 {
    public static int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    list.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        for(int i=0; i<list.size();i++){
            int cnt =0;
            for(int j=1;j<=list.get(i);j++){
                if(list.get(i)%j==0){
                    cnt++;
                }
            }
            if(cnt==2)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.print(solution(nums));
    }
}
