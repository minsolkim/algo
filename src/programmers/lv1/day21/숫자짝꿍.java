package programmers.lv1.day21;

import java.util.HashMap;

public class 숫자짝꿍 {
    public String solution(String X, String Y) {
        HashMap<Integer,Integer> Xmap = new HashMap<>();
        HashMap<Integer,Integer> Ymap = new HashMap<>();
        for(String xdata : X.split("")){
            int xnumber = Integer.parseInt(xdata);
            Xmap.put(xnumber,Xmap.getOrDefault(xnumber,0)+1);
        }
        for(String ydata : Y.split("")) {
            int ynumber = Integer.parseInt(ydata);
            Ymap.put(ynumber,Ymap.getOrDefault(ynumber,0)+1);
        }
        StringBuilder sb= new StringBuilder();
        //x의 키값과 y의 키값이 같을 경우 삽입
        for(int i=9;i>=0;i--) {
            if(Xmap.containsKey(i) && Ymap.containsKey(i)) {
                //몇개인지 체크
                int cnt =  Math.min(Xmap.get(i),Ymap.get(i));
                for(int j=0;j<cnt;j++) {
                    sb.append(i);
                }
            }
        }

        //예외처리
        //짝꿍 존재하지 않을 경우
        if(sb.toString().equals("")){
            return "-1";
        }else if(sb.toString().startsWith("0")){
            return "0";
        }
        return sb.toString();
    }
}
