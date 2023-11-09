package programmers.lv1.day6;

import java.util.Arrays;

public class K번째수 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            //배열 범위 지정
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];
            int index = 0;
            //인덱스는 0부터 시작하므로 -1을 해준다.
            //i부터 j까지 자른 후 새로운 배열 을 만든다.
            for (int j = commands[i][0]-1;j<commands[i][1];j++){
                    arr[index] = array[j];
                    index++;
            }
            //새로운 배열을 정렬한다.
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] solution = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(Arrays.toString(solution));
    }
}
