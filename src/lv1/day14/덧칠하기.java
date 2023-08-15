package lv1.day14;

public class 덧칠하기 {
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        //이전 넓이
        //start와 end 만큼의 넓이
        int preVPaint = section[0] + m-1;
        for(int i=0;i<section.length;i++){
            //이전넓이안의 들어간 수는 if문에 안들어감
            //이전넓이의 end 마지막 수보다 큰수는 새로 페인트 칠 해줘야 함
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
