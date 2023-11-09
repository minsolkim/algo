package programmers.lv1.day20;
import java.util.Arrays;
public class 문자열내림차순으로배치하기 {
        public String solution(String s) {
            char[] str = s.toCharArray();
            Arrays.sort(str);
            StringBuffer sb = new StringBuffer(new String(str));

            String answer = sb.reverse().toString();
            return answer;
        }
}
