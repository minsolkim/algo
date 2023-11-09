package programmers.lv2.day6;

public class 타겟넘버 {
    int answer =0;
    public int solution(int[] numbers, int target) {
        dfs(numbers,0,target,0); //depth와 sum값을 초기화 시킴
        return answer;
    }
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){ //dfs를 이용하여 마지막 노드까지 탐색한경우
            if(target == sum) //target넘버와 sum값이 같으면 answer카운트를 증가시킴
                answer++;
        }else{ //마지막 노드까지 간다음 다시 안올라갔던 노드 위로 올라감 dfs알고리즘
            dfs(numbers, depth +1,target,sum + numbers[depth]); //노드의 값을 더해주고 다음 깊이 탐색
            dfs(numbers, depth +1,target,sum - numbers[depth]); //노드의 값을 빼주고 다음 깊이 탐색
        }

    }

}
