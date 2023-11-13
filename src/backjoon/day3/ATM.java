package backjoon.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] time = new int[n];
        String[] arr= br.readLine().split(" ");
        for (int i=0;i<n;i++) {
            time[i] = Integer.parseInt(arr[i]);
        }
        //3,1,4,3,2
        //돈을 인출하는데 시간이 짧은 사람들로부터 돈을 인출해야 함
        Arrays.sort(time);
        int result = 0;
        int sum =0;
        for (int i=0;i<n;i++) {
            sum += time[i]; //더할 수
            result += sum; //총 합
        }
        System.out.print(result);
    }
}
