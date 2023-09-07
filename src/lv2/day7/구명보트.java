package lv2.day7;

import java.util.Arrays;

public class 구명보트 {
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        while (start<end) {
            if(people[start] +people[end] > limit){
                end--;
            }else{
                start++;
                end--;
            }
            answer++;
        }
        if (start==end) {
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] people = {70, 80, 50};
        int limit = 100;

        System.out.println(solution(people,limit));
    }
}
