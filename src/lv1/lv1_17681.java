package lv1;

public class lv1_17681 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] result = sol.solution(n, arr1, arr2);
        for(String str : result){
            System.out.println(str);
        }
    }
    static class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            //arr1과 arr2의 각 요소들을 or연산해서 merged배열에 저장
            int[] merged = new int[n];
            String[] result = new String[n];
            for(int i = 0 ; i < n ; i++){
                result[i] = "";
            }
            for(int i = 0 ; i < n ; i++){
                merged[i] = arr1[i] | arr2[i];
            }
            //이제 merged[i]에 들어있는 정수를 binary로
            for(int i = 0 ; i < merged.length ; i++){
                int num = merged[i];
                String binary = Integer.toBinaryString(num);
                int blankLength = n-binary.length();
                binary = "0".repeat(blankLength) + binary;
                for(int j = 0 ; j < binary.length() ; j++){
                    if(binary.charAt(j) == '1') result[i] += "#";
                    else result[i] += " ";
                }
            }
            return result;
        }
    }
}
