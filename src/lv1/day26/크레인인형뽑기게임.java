package lv1.day26;

import java.util.Stack;

public class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int k=0;k<moves.length;k++) {
            int row = moves[k] -1;
            int item = -1;
            for (int c=0;c<board.length;c++) {
                if (board[c][row]!=0) {
                    item = board[c][row];
                    board[c][row]=0;
                    break;
                }
            }
            //같은게 있으면 스택에서 뺀다
            if (item!=-1 && !stack.isEmpty() && stack.peek() == item){
                stack.pop();
                answer+=2;
            }else{
                stack.push(item);
            }
        }
        return answer;
    }
}
