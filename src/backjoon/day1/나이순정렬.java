package backjoon.day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 나이순정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Member[] m = new Member[N];
        for(int i=0; i<N;i++) {
            m[i] = new Member(sc.nextInt(), sc.next());
        }
        Arrays.sort(m, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o1.age - o2.age;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            sb.append(m[i]);
        }
        System.out.println(sb);
    }
    //member class
    public static class Member {
        int age;
        String name;
        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public String toString() {
            return age + " " + name + "\n";
        }
    }
}
