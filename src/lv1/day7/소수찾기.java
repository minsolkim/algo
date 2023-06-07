package lv1.day7;

public class 소수찾기 {
    public static int solution(int n) {
        int answer = 0;
        boolean flag;
        int cnt = 0;
        for(int i=2;i<=n;i++){
            flag=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j ==0){
                    flag=false;
                    break;
                }
            }
            if(flag)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.print(solution(10));
    }
}
