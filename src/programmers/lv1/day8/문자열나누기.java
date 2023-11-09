package programmers.lv1.day8;

public class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        char trim = s.charAt(0);
        int indexa=0;
        int indexb=0;
        for(int i=0; i<s.length();i++){
            //첫번째 문자와 그외 다른문자의 횟수가 같을 경우만 문자열을 분리
            if(indexa==indexb){
                answer++;
                //분열시킨후 다음 문자로 넘거야 하므로
                trim = s.charAt(i);

            }
            if(s.charAt(i)==trim)
                indexa++;
            else indexb++;
        }
        return answer;
    }
}
