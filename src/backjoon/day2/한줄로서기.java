package backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한줄로서기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberofPerson = Integer.parseInt(br.readLine()); //몇명이 있는지
        String[] input = br.readLine().split(" "); //자신보다 키큰사람이 왼쪽에 몇명 존재하는지
        solve(numberofPerson,input);

    }
    private static void solve(int numberofPerson, String[] input) {
        int[] line = new int[numberofPerson];
        for(int i=0;i<numberofPerson;i++) {
            int left = Integer.parseInt(input[i]); //왼쪽에 몇명 서있는지
            int position = searchPosition(line,left,numberofPerson);
            //인덱스는 0부터 시작하므로 i+1을 해준다.
            line[position] = i+1;
        }
        printLine(line);
    }
    //자신의 위치가 어디에 존재하는지 체크
    private static int searchPosition(int[] line, int numberofLeftPerson, int numberofPerson) {
        //numberofLeftPerson이 0이 될때까지 for문을 돌려야함 그래야 포지션을 구할 수 있음
        for(int position=0;position < numberofPerson;position++) {
            //자신보다 큰 사람이 왼쪽에 없을 경우
            if(numberofLeftPerson ==0 && line[position] == 0) {
                return position;
            }
            if (line[position] ==0) numberofLeftPerson--;
        }
        return -1;
    }
    private static void printLine(int[] line) {
        for(int i=0;i<line.length;i++) {
            System.out.print(line[i] + " ");
        }
    }
}
