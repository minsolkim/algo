package lv1.day4;

import java.util.ArrayList;

public class 모의고사 {
    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        for (int i = 0; i < answers.length; i++) {
            if (person1[i % 5] == answers[i])
                answer1++; // 비교하고자하는 각 n번째값이랑 비교하고 값이 같으면 맞힌개수 증가하기
            else if (person2[i % 8] == answers[i])
                answer2++;
            else if (person3[i % 10] == answers[i])
                answer3++;
        }
        //최댓값 구하기
        int max = Math.max(Math.max(answer1, answer2), answer3);
        //배열에 넣기
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (max==answer1)
            list.add(1);
        if (max==answer2)
            list.add(2);
        if (max==answer3)
            list.add(3);
        //오름차
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        int[] result = solution(answers);
        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }
    }
}
