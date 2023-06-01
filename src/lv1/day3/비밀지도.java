package lv1.day3;

public class 비밀지도 {
    public String[] solution(int n,int[] arr1, int[] arr2){
        String[] answer = new String[n];
        for(int i=0;i< n;i++){
            StringBuffer route = new StringBuffer();
            String binary = Binary(n,Integer.toBinaryString(arr1[i])); //n에 맞추어 이진수로 변환
            String binary2 =Binary(n,Integer.toBinaryString(arr2[i])); //n에 맞추어 이진수로 변환
            for(int j=0;j<n;j++){
                //2진수가 1인경우 # 벽으로 만들어야함
                if(binary.charAt(j) =='1' || binary2.charAt(j)=='1'){
                    route.insert(j,"#");
                }else {
                    route.insert(j," ");
                }
                answer[i] = route.toString();
            }

        }
        return answer;
    }
    public String Binary(int n, String arg){
        StringBuffer res = new StringBuffer(arg);
        //이진수로 변환한 수가 변의길이보다 작은경우 0을 넣어줘야함
        if(arg.length() < n) {
            for(int i=0;i<n-arg.length();i++)
                res.insert(0,"0");
        }
        return res.toString();
        //빈공간은 0으로
    }

    public static void main(String[] args) {
        비밀지도 test = new 비밀지도();
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] res = test.solution(5, arr1, arr2);
        for (String a : res)
            System.out.println(a);

    }
}
