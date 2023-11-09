package programmers.lv1.day2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class 윤년 {
    public String solution(int a, int b) {
        int sum=0;
        Calendar c = Calendar.getInstance();
        c.set(2016,a-1,b);
        String answer = new SimpleDateFormat("EEE", Locale.ENGLISH).format(c.getTime()).toUpperCase();

        return answer;
    }

    public static void main(String[] args) {
        윤년 test = new 윤년();
        System.out.println(test.solution(5,24));

    }

}
