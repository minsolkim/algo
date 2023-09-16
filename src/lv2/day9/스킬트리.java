package lv2.day9;

import java.util.HashMap;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        //선행스킬이 적용안되는 일반스킬만 있을 경우 무조건 true
        boolean check = true;
        for (int i=0;i<skill.length();i++){
            //(선행스킬,순서) 저장
            map.put(skill.charAt(i),i);
        }
        char[] skills;
        for (int i=0;i< skill_trees.length;i++){
            skills = skill_trees[i].toCharArray();
            //순서대로 스킬이 들어가있으므로 초기값을 0으로 함
            int skillorder=0;
            for (int j=0;j<skills.length;j++) {
                //선행스킬순서 알파벳인지
                if (!map.containsKey(skills[j]))
                    continue;
                //선행스킬 이후로 후행스킬 적용
                if (map.get(skills[j]) == skillorder) {
                    //선행스킬이 있는경우 그다음 스킬 적용 가능
                    skillorder++;
                }else {
                    //선행스킬 전에 후행수킬을 적용할 경우
                    check = false;
                    break;
                }
            }
            if (check) {
                //선행스킬이 순서에 맞게 적용된경우
                answer++;
            }else {
                check = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String skill = "BAC";
        String[] skill_trees = { "DE", "CBADF", "AECB", "BDAC", "TCEA" };
        System.out.println(solution(skill,skill_trees));

    }
}
