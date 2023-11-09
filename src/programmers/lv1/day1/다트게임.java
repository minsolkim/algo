package programmers.lv1.day1;


public class 다트게임 {
    public int solution(String dartResult) {
        int answer =0;
        int[] result = new int[3];
        char[] dart = dartResult.toCharArray();
        int sum = 0;
        int dartCnt = 0;
        //하나씩 쪼갠다
        for (int i = 0; i < dartResult.length(); i++) {
            //숫자일 경우
            if (Character.isDigit(dart[i])) {
                if (i != 0) {
                    result[dartCnt++] = sum;
                }
                //10일 경우 예외
                if ((int) dart[i + 1] == '0') {
                    sum = 10;
                    i++;
                    continue;
                } else sum = dart[i] - '0';
            }
            if (dart[i] == 'S') {
                ;
            } else if (dart[i] == 'D') {
                sum *= sum;
            } else if (dart[i] == 'T') {
                sum = (int) Math.pow(sum, 3);
            } else if (dart[i] == '*') {
                sum *= 2;
                //바로앞에꺼 2배
                if (dartCnt!=0) {
                    result[dartCnt-1] *=2;
                }
            } else if (dart[i] == '#') {
                sum *= -1;
            }
            if (i == dartResult.length() - 1 && dartCnt == 2) {
                result[dartCnt] = sum;
            }
        }
            for (int i: result) {
                answer +=i;
            }
            return answer;
        }
    public static void main(String[] args) {
        다트게임 test = new 다트게임();
        System.out.println(test.solution("1S2D*3T"));
    }
}
