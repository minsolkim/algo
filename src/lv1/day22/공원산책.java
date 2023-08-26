package lv1.day22;
public class 공원산책 {
    static String[][] matrix = null;
    static int x,y;
    public int[] solution(String[] park, String[] routes) {
        //공원의 높이
        int height = park.length;
        int width = park[0].length();//공원의 넓이
        matrix = new String[height][width];

        for(int i=0;i< height;i++) { //[0][0],[0][1],[0][2] ...
            for(int j=0;j<width;j++){
                //각 행마다 순서
                matrix[i][j] = String.valueOf(park[i].charAt(j));
            }
        }
        //S 처음위치 어디인지 알아야함
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(matrix[i][j].equals("S")) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        int subx = x;
        int suby = y;
        //좌표 동,서,남,북 움직일 경우
        //일단 방향과 몇번 움직이는지 분리
        for(int i=0;i < routes.length;i++) {
            String[] str = routes[i].split(" ");
            int dir = Integer.parseInt(str[1]);
            for(int j=0;j< dir;j++) {
                switch (str[0]) {
                    case "N":
                        subx -=1;
                        break;
                    case "S":
                        subx +=1;
                        break;
                    case "W":
                        suby -=1;
                        break;
                    case "E":
                        suby +=1;
                        break;
                }
                //조건에 만족하지 않는경우
                if(!check(subx,suby)) {
                    subx = x;
                    suby = y;
                    break;
                }

            }
            x = subx;
            y = suby;
        }
        int[] answer = {x,y};
        return answer;
    }
    static boolean check(int x, int y) {
        return x >=0 && x < matrix.length && y >=0 && y < matrix[0].length && !matrix[x][y].equals("X");
    }
}
