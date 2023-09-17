package lv2.day11;

public class 피로도 {
    public static boolean[] visited;
    public static int answer = -1;
    public static int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length]; //처음 [false,false,false]
        dfs(0,k,dungeons);
        return answer;
    }
    public static void dfs(int depth, int k, int[][] dungeons) {
        for (int i=0;i< dungeons.length;i++) {
            int a = dungeons[i][0];
            //현재피로도가 최소피로도보다 큰지 비교
            //방문했던 노드인지 확인
            if (visited[i] == false && k >= a){
                visited[i] = true;
                //현재피로도에서 소모피로도 빼기
                dfs(depth+1,k-dungeons[i][1],dungeons);
                visited[i] = false;
            }
        }
        //남은 피로도가 최소피로도보다 작으면
        answer = Math.max(answer, depth);

    }

    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}
