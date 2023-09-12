package lv2.day9;

import java.util.ArrayList;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] ad = skill.split("");
        for (int i=0;i<skill_trees.length;i++) {
            if(checkskill(ad,skill_trees[i]))
                answer++;
        }
        return answer;
    }
    static boolean checkskill(String[] skills, String skillorder) {
        int cnt =0;
        for (int i=0;i<skillorder.length();i++) {
            for (int j = cnt; j < skills.length;j++) {
                if (skillorder.charAt(i) == skills[j].charAt(0)){
                    if (cnt < j) {
                        return false;
                    }
                    cnt++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String skill = "BAC";
        String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDAC", "TCEA" };
        System.out.println(solution(skill,skill_trees));

    }
}
