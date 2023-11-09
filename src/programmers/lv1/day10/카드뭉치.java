package programmers.lv1.day10;

public class 카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int index1=0;
        int index2=0;
        for(int i=0;i< goal.length;i++){
            if(cards1[index1].equals(goal[i])){
                index1++;
                if(index1 > cards1.length-1){
                    index1 = cards1.length-1;
                }
            }
            else if(cards2[index2].equals(goal[i])){
                index2++;
                if(index2 > cards2.length-1){
                    index2 = cards2.length -1;
                }
            } else {
                return "No";
            }
        }
        return "yes";
    }
}
