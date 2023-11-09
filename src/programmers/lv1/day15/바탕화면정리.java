package programmers.lv1.day15;

public class 바탕화면정리 {
    public static int[] solution(String[] wallpaper) {
        int top = 51;
        int left = 51;
        int bottom = -1;
        int right = -1;

        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    top = Math.min(i,top);
                    left = Math.min(j,left);
                    bottom = Math.max(i+1,bottom);
                    right = Math.max(j+1,right);
                }
            }
        }
        int[] answer = new int[]{top,left,bottom,right};
        return answer;
    }

    public static void main(String[] args) {
        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(solution(wallpaper));
    }

}
