package lv1.day23;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tmp;
        if (n>m) {
            tmp = m;
            m=n;
            n = tmp;
        }
        for (int i=n;i>0;i--){
            if (n%i ==0 && m%i ==0) {
                answer[0] = i;
                break;
            }
        }
        //최소공배수
        answer[1] = n*m /answer[0];
        return answer;
    }
}
