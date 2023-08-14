package lv1.day14;

public class 덧칠하기 {
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        int preVPaint = section[0] + m-1;
        for(int i=0;i<section.length;i++){
            if(preVPaint < section[i]){
                preVPaint = section[i] + m -1;
                answer++;
            }
    }

        return answer;
    }

    public static void main(String[] args) {
        int[]  section = new int[]{2,3,6};
        System.out.print(solution(8,4,section));
    }
}
