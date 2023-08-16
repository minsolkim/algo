package lv1.day16;

import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> keypad = new HashMap<>();
        for(int i=0; i< keymap.length;i++) {
            for(int j=0;j<keymap[i].length();j++){
                char ch = keymap[i].charAt(j);
                if(keypad.containsKey(ch)){
                    int index = keypad.get(ch);
                    keypad.put(ch,Math.min(index,j+1));
                }else {
                    //중복되는게 없을 경우
                    keypad.put(ch,j+1);
                }
            }
        }
        for(int i=0;i< targets.length;i++) {
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            for(char ch : target.toCharArray()) {
                if(keypad.containsKey(ch)){
                    count += keypad.get(ch);
                }else {
                    flag = false;
                    break;
                }
            }
            answer[i] = flag == false ?-1 : count;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] keymap = {"BC"};
        String[] targets = {"AC", "BC"};
        System.out.println(Arrays.toString(solution(keymap, targets)));
    }
}
